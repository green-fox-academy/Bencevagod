package com.greenfox.reddit_project.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String url;
    private Integer votes;
    private java.time.LocalDateTime time;

//    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private RedditUser redditUser;

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.votes = 0;
        this.time = java.time.LocalDateTime.now();
    }

    public Post() {}

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public Integer getVotes() {
        return votes;
    }

    public Long getId() {
        return id;
    }

    public String getTime() {
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return this.time.format(myFormatter);
    }

    public void incrementVote() {
        this.votes++;
    }

    public void decrementVote() {
        this.votes--;
    }
}
