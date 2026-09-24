package org.acme;

public class Gav {

    private String group;

    private Gav(String group) {
        this.group = group;
    }

    public static Gav parse(String coordinate) {
        return new Gav("org.acme");
    }

    public String getGroup() {
        return group;
    }
}