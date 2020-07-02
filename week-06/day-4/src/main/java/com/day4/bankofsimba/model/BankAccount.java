package com.day4.bankofsimba.model;

public class BankAccount {
    private String name;
    private Integer balance;
    private String animalType;
    private Boolean isBadGuy;
    private Boolean isKing;

    public BankAccount(String name, Integer balance, String animalType, Boolean isBadGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isBadGuy = isBadGuy;
        this.isKing = name.equals("Simba");
    }

    public Boolean isKing() {
        return this.isKing;
    }

    public String getName() {
        return name;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setBadGuy(Boolean badGuy) {
        isBadGuy = badGuy;
    }

    public String isKingClass() {
        return "Simba".equals(this.name) ? "king" : "";
    }

    public Boolean isBadGuy() {
        return this.isBadGuy;
    }

    public String getBadGuy() {
        if (this.isBadGuy()) {
            return "Bad guy";
        }
        return "Good guy";
    }

    public String isBadGuyClass() {
        if (this.isBadGuy()) {
            return "bad";
        }
        return "good";
    }

    public void raiseBalance() {
        if (this.isKing()) {
            this.balance += 100;
        } else {
            this.balance += 10;
        }
    }
}
