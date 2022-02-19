package com.amandaamelia.myapplication.model;

public class RekomenCake {

    String name;
    String desc;
    Integer imageUrl;

    public RekomenCake(String name, String desc, Integer imageUrl) {
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


    public String getDesc() {
        return desc;
    }

    public void setDesc(String description) {
        this.desc = desc;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}