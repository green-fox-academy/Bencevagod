package com.greenfox.programmer_fox_club.Model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private Foods food;
    private Drinks drink;
    private List<Trick> tricks;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<Trick>();
        this.food = Foods.MUSHROOMS;
        this.drink = Drinks.CHAMPAGNE;
    }

    public String getName() {
        return name;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public String getFood() {
        return food.getFood();
    }

    public String getDrink() {
        return drink.getDrink();
    }

    public void setFood(String food) {
        this.food = Foods.valueOf(food.toUpperCase());
    }

    public void setDrink(String drink) {
        this.drink = Drinks.valueOf(drink.toUpperCase());
    }

    public String knowNoTricksClass() {
        return this.getTricks().size() == 0 ? "" : "hidden";
    }

    public void addTrick(String trick) {
        this.tricks.add(new Trick(trick));
    }
}
