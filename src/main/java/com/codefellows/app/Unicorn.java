package com.codefellows.app;

/**
 * Created by Brad.Farr on 2/21/2017.
 */
public class Unicorn {
    private String name;
    private Location location;

    public Unicorn(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() { return location; }

    public String toString() {
        return String.format("The unicorn named: %s is currently in the: %s", name, location);
    }
}
