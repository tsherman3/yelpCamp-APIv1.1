package com.yelpCamp.entity;

public class Campground {
    private int id;
    private String name;
    private String info;

    public Campground(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public Campground(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}