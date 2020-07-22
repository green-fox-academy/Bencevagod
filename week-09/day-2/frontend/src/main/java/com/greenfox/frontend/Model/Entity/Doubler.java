package com.greenfox.frontend.Model.Entity;

public class Doubler {

    private Integer received;
    private Integer result;
    private String error;

    public Doubler(Integer received) {
        this.received = received;
        this.result = received *2;
    }

    public Doubler() {
        this.error = "Please provide an input!";
    }

    public Integer getReceived() {
        return received;
    }

    public Integer getResult() {
        return result;
    }

    public String getError() {
        return error;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void setError(String error) {
        this.error = error;
    }
}
