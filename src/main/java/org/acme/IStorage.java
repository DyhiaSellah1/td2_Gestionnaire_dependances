package org.acme;

import java.util.Optional;

public interface IStorage {

    void put(Artifact artifact);

    Optional<Artifact> get(String coordinate);
}