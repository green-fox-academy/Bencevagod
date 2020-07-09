package com.greenfox.programmer_fox_club.Model;

public enum Drinks {
    WATER("water"),
    CHAMPAGNE("champagne"),
    BLOOD("blood");

    private String drink;

    Drinks(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
