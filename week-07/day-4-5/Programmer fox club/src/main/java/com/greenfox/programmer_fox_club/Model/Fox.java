package com.greenfox.programmer_fox_club.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fox {
    private String name;
    private Foods food;
    private Drinks drink;
    private Tricks trickName;
    private List<Trick> learnedTricks;
    private List<Tricks> learnableTricks;

    public Fox(String name) {
        this.name = name;
        this.learnedTricks = new ArrayList<Trick>();
        this.food = Foods.MUSHROOMS;
        this.drink = Drinks.CHAMPAGNE;
        this.learnableTricks = new ArrayList<>(Arrays.asList(Tricks.values()));
    }

    public String getName() {
        return name;
    }

    public List<Trick> getTricks() {
        return learnedTricks;
    }

    public String getFood() {
        return food.getFood();
    }

    public String getDrink() {
        return drink.getDrink();
    }

    public Foods getEnumFood() {
        return this.food;
    }

    public Drinks getEnumDrink() {
        return this.drink;
    }

    public void setFood(String food) {
        this.food = Foods.valueOf(makeEnumCompatible(food));
    }

    public void setDrink(String drink) {
        this.drink = Drinks.valueOf(makeEnumCompatible(drink));
    }

    public String knowNoTricksClass() {
        return this.getTricks().size() == 0 ? "" : "hidden";
    }

    public List<Tricks> getLearnableTricks() {
        return learnableTricks;
    }

    public void learnTrick(String trick) {
            this.learnedTricks.add(new Trick(trick));
            learnableTricks.remove(Tricks.valueOf(makeEnumCompatible(trick)));
    }

    public List<Foods> getSortedFoodList() {
        List<Foods> orderedFoodList = new ArrayList<>(Arrays.asList(Foods.values()));
        orderedFoodList.remove(this.getEnumFood());
        orderedFoodList.add(0, this.getEnumFood());
        return orderedFoodList;
    }

    public List<Drinks> getSortedDrinkList() {
        List<Drinks> orderedDrinkList = new ArrayList<>(Arrays.asList(Drinks.values()));
        orderedDrinkList.remove(this.getEnumDrink());
        orderedDrinkList.add(0, this.getEnumDrink());
        return orderedDrinkList;
    }

    private static String makeEnumCompatible(String s) {
        return s.replaceAll("\\s","").toUpperCase();
    }
}
