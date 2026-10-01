package org.acme;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GavTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/gav-test.csv")
    void shouldParseGav(String coordinate, String expectedGroup,
                        String expectedArtifact, String expectedVersion) {

        Gav gav = Gav.parse(coordinate);

        assertEquals(expectedGroup, gav.getGroup());
        assertEquals(expectedArtifact, gav.getArtifact());
        assertEquals(expectedVersion, gav.getVersion());
    }
}