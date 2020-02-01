package com.officialJokeAPI.joke.official.api.models;

public class Joke {
    private String id;
    private String type;
    private String setup;
    private String punchline;

    public Joke() {
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSetup() {
        return setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public Joke(String id, String type, String setup, String punchline) {
        this.id = id;
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }
}