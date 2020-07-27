package com.greenfox.ebay_project.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Hirdetes {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String termek;
    private String category;
    private String user;
    private String description;
    private Integer price;
    private Integer numberOfSells;

    @OneToMany(mappedBy = "hirdetes")
    private List<Ertekeles> ertekeles;

    public Hirdetes() {
    }

    public Long getId() {
        return id;
    }

    public String getTermek() {
        return termek;
    }

    public String getCategory() {
        return category;
    }

    public String getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getNumberOfSells() {
        return numberOfSells;
    }

    public List<Ertekeles> getErtekeles() {
        return ertekeles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTermek(String termek) {
        this.termek = termek;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setNumberOfSells(Integer numberOfSells) {
        this.numberOfSells = numberOfSells;
    }

    public void setErtekeles(List<Ertekeles> ertekeles) {
        this.ertekeles = ertekeles;
    }
}
