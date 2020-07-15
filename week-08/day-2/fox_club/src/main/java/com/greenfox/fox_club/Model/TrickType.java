package com.greenfox.fox_club.Model;

public enum TrickType {

    HOWL("Howl"),
    PLAYDEAD("Play dead"),
    POOP("Poop");

    private String trick;

    TrickType(String trick) {
        this.trick = trick;
    }

    public String getTrick() {
        return trick;
    }
}
