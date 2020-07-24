package com.greenfox.trial_exam.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private String alias;
    private Integer secretCode;
    private Integer hitCount;

    public Alias() {
    }

    public Alias(String url, String alias, Integer secretCode) {
        this.url = url;
        this.alias = alias;
        this.secretCode = secretCode;
        this.hitCount = 0;
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getAlias() {
        return alias;
    }

    public Integer getSecretCode() {
        return secretCode;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setSecretCode(Integer secretCode) {
        this.secretCode = secretCode;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }
}
