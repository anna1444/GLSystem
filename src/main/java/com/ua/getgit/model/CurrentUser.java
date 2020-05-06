package com.ua.getgit.model;

import com.ua.getgit.entities.User;

public class CurrentUser {
    private int currentCoins=5;
    private User user;

    public CurrentUser(User user) {
        this.user=user;
    }

    public int getCurrentCoins() {
        return currentCoins;
    }

    public void setCurrentCoins(int currentCoins) {
        this.currentCoins = currentCoins;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
