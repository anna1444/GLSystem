package com.ua.getgit.entities;

public class Rating {
    private Integer place;
    private String gamerUsername;
    private Integer coins;

    public Rating() {
    }

    public Rating(Integer place, String gamerUsername, Integer coins) {
        this.place = place;
        this.gamerUsername = gamerUsername;
        this.coins = coins;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public String getGamerUsername() {
        return gamerUsername;
    }

    public void setGamerUsername(String gamerUsername) {
        this.gamerUsername = gamerUsername;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }
}
