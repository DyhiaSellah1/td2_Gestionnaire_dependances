package org.acme;

public class Gav {

    private String group;
    private String artifact;
    private String version;

    private Gav(String group, String artifact, String version) {
        this.group = group;
        this.artifact = artifact;
        this.version = version;
    }

    public static Gav parse(String coordinate) {
        String[] parts = coordinate.split(":", -1);

        if (parts.length != 3
                || parts[0].isEmpty()
                || parts[1].isEmpty()
                || parts[2].isEmpty()) {
            throw new IllegalArgumentException("Invalid GAV: " + coordinate);
        }

        return new Gav(parts[0], parts[1], parts[2]);
    }

    public String getGroup() {
        return group;
    }

    public String getArtifact() {
        return artifact;
    }

    public String getVersion() {
        return version;
    }
}