package org.acme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedLineReader implements ILineReader {

    private final BufferedReader reader;

    public BufferedLineReader(Reader reader) {
        this.reader = new BufferedReader(reader);
    }

    @Override
    public String readLine() throws IOException {
        return reader.readLine();
    }
}