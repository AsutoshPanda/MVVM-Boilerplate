package com.asutosh.mvvmsample.model;

public class NicePlacePojo {

    private String title;
    private String imageUrl;

    public NicePlacePojo(String imageUrl, String title) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public NicePlacePojo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
