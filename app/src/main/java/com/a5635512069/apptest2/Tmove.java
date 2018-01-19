package com.a5635512069.apptest2;

/**
 * Created by 5635512069 on 1/19/2018.
 */

public class Tmove {
    private int id;
    private String name;
    private String type;
    private String pictures;
    private int equip;
    private String des;
    private String videos;


    public Tmove(int id, String name, String type, String pictures, int equip, String des, String videos) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.pictures = pictures;
        this.equip = equip;
        this.des = des;
        this.videos = videos;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public int getEquip() {
        return equip;
    }

    public void setEquip(int equip) {
        this.equip = equip;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }
}
