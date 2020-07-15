package com.greenfox.fox_club.Model;

import javax.persistence.*;

@Entity
public class Trick {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private TrickType trickType;

    public Trick(String trickName) {
        this.trickType = TrickType.valueOf(makeEnumCompatible(trickName));
    }

    public Trick(){}

    public String trickType() {
        return trickType.getTrick();
    }

    private static String makeEnumCompatible(String s) {
        return s.replaceAll("\\s","").toUpperCase();
    }
}
