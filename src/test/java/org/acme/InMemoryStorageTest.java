package org.acme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InMemoryStorageTest {

    private IStorage storage;

    @BeforeEach
    void init() {
        storage = new InMemoryStorage();
    }

    @Test
    void shouldStoreAndGetArtifact() {
        Artifact artifact = new Artifact("org.acme", "lib-a", "1.0.0");

        storage.put(artifact);

        assertEquals(
                artifact,
                storage.get("org.acme:lib-a:1.0.0").orElseThrow()
        );
    }
}