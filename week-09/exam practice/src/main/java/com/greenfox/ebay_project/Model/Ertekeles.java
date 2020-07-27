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
}
