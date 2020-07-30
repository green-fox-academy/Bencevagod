package com.greenfox.ebay_project.Model;

import javax.persistence.*;

@Entity
public class Ertekeles {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user;
    private String content;
    private Integer stars;

    @ManyToOne
    @JoinColumn(name = "hirdetes_id",referencedColumnName = "id")
    private Hirdetes hirdetes;

    public Ertekeles(String user, String content, Integer stars, Hirdetes hirdetes) {
        this.user = user;
        this.content = content;
        this.stars = stars;
        this.hirdetes = hirdetes;
    }

    public Ertekeles() {
    }

    public Long getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public Integer getStars() {
        return stars;
    }

    public Hirdetes getHirdetes() {
        return hirdetes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public void setHirdetes(Hirdetes hirdetes) {
        this.hirdetes = hirdetes;
    }
}
