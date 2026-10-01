package org.acme;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GavTest {

    @ParameterizedTest
    @CsvSource({
            "org.acme:lib-a:1.0.0, org.acme, lib-a, 1.0.0",
            "org.other:lib-c:3.0.0, org.other, lib-c, 3.0.0"
    })
    void shouldParseGav(String coordinate, String expectedGroup,
                        String expectedArtifact, String expectedVersion) {

        Gav gav = Gav.parse(coordinate);

        assertEquals(expectedGroup, gav.getGroup());
        assertEquals(expectedArtifact, gav.getArtifact());
        assertEquals(expectedVersion, gav.getVersion());
    }
}