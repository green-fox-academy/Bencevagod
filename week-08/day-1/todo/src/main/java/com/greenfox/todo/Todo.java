package com.greenfox.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Boolean urgent;
    private Boolean done;

    public Todo() {

    }

    public Todo(String name) {
        this.name = name;
        this.urgent = false;
        this.done = false;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public Boolean getDone() {
        return done;
    }
}
