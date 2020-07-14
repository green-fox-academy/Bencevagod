package com.greenfox.fox_club.Model;

public enum Tricks {

    HOWL("Howl"),
    PLAYDEAD("Play dead"),
    POOP("Poop");

    private String trick;

    Tricks(String trick) {
        this.trick = trick;
    }

    public String getTrick() {
        return trick;
    }
}
