package com.greenfox.programmer_fox_club.Model;

public enum Foods {
    SALAD("salad"),
    CHICKPEAS("chickpeas"),
    MUSHROOMS("mushrooms");

    private String food;

    Foods(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}
