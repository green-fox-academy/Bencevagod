package com.greenfox.frontend.Model.Entity;

public class UntilResult {

    private Integer until;
    private Integer result;

    public UntilResult(Integer until, Integer result) {
        this.until = until;
        this.result = result;
    }

    public Integer getUntil() {
        return until;
    }

    public Integer getResult() {
        return result;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
