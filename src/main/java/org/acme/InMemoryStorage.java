package org.acme;

import java.util.Optional;

public class InMemoryStorage implements IStorage {

    @Override
    public void put(Artifact artifact) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Artifact> get(String coordinate) {
        throw new UnsupportedOperationException();
    }
}