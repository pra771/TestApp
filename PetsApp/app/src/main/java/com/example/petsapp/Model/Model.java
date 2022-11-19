package com.example.petsapp.Model;

public class Model {
    String title,description;
    int screenImg;

    public Model(String title, String description, int screenImg) {
        this.title = title;
        this.description = description;
        this.screenImg = screenImg;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getScreenImg() {
        return screenImg;
    }
}
