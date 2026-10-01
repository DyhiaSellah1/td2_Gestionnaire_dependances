package org.acme;

public record Artifact(String group, String name, String version) {

    public String getCoordinate() {
        return group + ":" + name + ":" + version;
    }
}