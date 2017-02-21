package com.codefellows.app;

/**
 * Created by Brad.Farr on 2/21/2017.
 */
public abstract class Location {
    private String name;

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
