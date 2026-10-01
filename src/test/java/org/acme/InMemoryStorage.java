package org.acme;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryStorage implements IStorage {

    private final Map<String, Artifact> artifacts = new HashMap<>();

    @Override
    public void put(Artifact artifact) {
        artifacts.put(artifact.getCoordinate(), artifact);
    }

    @Override
    public Optional<Artifact> get(String coordinate) {
        return Optional.ofNullable(artifacts.get(coordinate));
    }
}