package org.acme;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BufferedLineReaderTest {

    @Test
    void shouldReadLines() throws Exception {
        StringReader input = new StringReader(
                "premiere ligne\ndeuxieme ligne"
        );

        ILineReader reader = new BufferedLineReader(input);

        assertEquals("premiere ligne", reader.readLine());
        assertEquals("deuxieme ligne", reader.readLine());
        assertEquals(null, reader.readLine());
    }
}