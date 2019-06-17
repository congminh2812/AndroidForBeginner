package com.example.androidforbeginner.Tutorials;

public class Lesson {
    private int image;
    private String title;

    public Lesson(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
