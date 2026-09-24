package org.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GavTest {

    @Test
    void shouldParseGroup() {
        Gav gav = Gav.parse("org.acme:lib-a:1.0.0");

        assertEquals("org.acme", gav.getGroup());
    }
    @Test
    void shouldParseAnotherGav() {
        Gav gav = Gav.parse("org.other:lib-c:3.0.0");

        assertEquals("org.other", gav.getGroup());
        assertEquals("lib-c", gav.getArtifact());
        assertEquals("3.0.0", gav.getVersion());
    }
}