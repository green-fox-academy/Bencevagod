package com.greenfox.programmer_fox_club.Model;

public enum Foods {
    SALAD("Salad"),
    CHICKPEAS("Chickpeas"),
    MUSHROOMS("Mushrooms"),
    ICECREAM("Ice cream");

    private String food;

    Foods(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}
