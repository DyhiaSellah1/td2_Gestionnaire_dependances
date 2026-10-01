package org.acme;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GavTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/gav-test.csv")
    void shouldParseGav(String coordinate, String expectedGroup,
                        String expectedArtifact, String expectedVersion) {

        Gav gav = Gav.parse(coordinate);

        /*assertThat(gav.getGroup(), is(expectedGroup));*/
        assertThat(gav.getGroup(), is("FAUX"));
        assertThat(gav.getArtifact(), is(expectedArtifact));
        assertThat(gav.getVersion(), is(expectedVersion));
    }
}