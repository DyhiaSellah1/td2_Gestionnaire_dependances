package org.acme;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
    @ParameterizedTest
    @CsvSource({
            "org.acme:lib-a",
            "org.acme:lib-a:1.0.0:extra",
            ":lib-a:1.0.0",
            "org.acme::1.0.0",
            "org.acme:lib-a:",
            "''"
    })
    void shouldRejectInvalidGav(String coordinate) {

        assertThrows(IllegalArgumentException.class, () -> Gav.parse(coordinate));
    }
}