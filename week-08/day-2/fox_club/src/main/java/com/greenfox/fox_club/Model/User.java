package com.greenfox.fox_club.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Fox> foxes;

    public User() {}

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
