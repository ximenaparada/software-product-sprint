package com.google.sps.data;

public class ServerFacts {
    private String type;
    private String fact;

    public ServerFacts(String type, String fact) {
        this.type = type;
        this.fact = fact;
    }

    // getters and setters
    public String getType() {
        return type;
    }

    public String getFact() {
        return fact;
    }
}