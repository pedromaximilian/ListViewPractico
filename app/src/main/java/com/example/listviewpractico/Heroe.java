package com.example.listviewpractico;

public class Heroe {
    private int picture;
    private String name;
    private int level;

    public Heroe(int picture, String name, int level) {
        this.picture = picture;
        this.name = name;
        this.level = level;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
