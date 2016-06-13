package de.sonni.ponyhof.rest;

/**
 * Pony entity, will be managed by the {@link Application} as JSON.
 */
public class Pony {

    private String name;

    public Pony(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
