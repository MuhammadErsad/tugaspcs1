package com.example.recycleview;

public class Movie {
    private String title;

    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
    }

    private String year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
