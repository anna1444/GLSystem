package com.ua.getgit.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private String status;


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "user_level",
            joinColumns = @JoinColumn(name = "id_level"),
            inverseJoinColumns = @JoinColumn(name = "id_user")
    )

   private  List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
