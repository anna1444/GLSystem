package com.ua.getgit.entities;

public class Progress {
    private Integer number;
    private String lecture;
    private Integer coins;

    public Progress() {
    }

    public Progress(Integer number, String lecture, Integer coins) {
        this.number = number;
        this.lecture = lecture;
        this.coins = coins;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }
}
