package com.amandaamelia.myapplication.model;


import android.graphics.drawable.Drawable;

public class PopularCake {

    String name;
    String desc;
    int imageUrl;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PopularCake(String name, String desc, int imageUrl) {
        this.name = name;
        this.desc = desc;
        this.imageUrl = imageUrl;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}