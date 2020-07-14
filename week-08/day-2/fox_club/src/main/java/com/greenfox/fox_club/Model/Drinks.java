package com.greenfox.fox_club.Model;

public enum Drinks {

    WATER("Water"),
    CHAMPAGNE("Champagne"),
    BLOOD("Blood");

    private String drink;

    Drinks(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
