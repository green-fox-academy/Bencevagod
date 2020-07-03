package com.greenfox.webshop.model;

public class ShopItem {
    private String name;
    private String description;
    private Float price;
    private Integer quantityInStock;

    public ShopItem(String name, String description, Float price, Integer quantityInStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }
}
