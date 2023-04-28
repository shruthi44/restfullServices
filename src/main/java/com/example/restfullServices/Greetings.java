package com.example.restfullServices;

public class Greetings {
    private long id;
    private String name;

    public Greetings(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
