package com.example.listofsongs;

public class Songs {
    private String name;
    private int image;
    private int musicpath;


    public Songs(String name, int image, int musicpath) {
        this.name = name;
        this.image = image;
        this.musicpath = musicpath;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getMusicpath() {
        return musicpath;
    }
}
