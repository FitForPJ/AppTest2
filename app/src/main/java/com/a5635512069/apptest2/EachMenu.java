package com.a5635512069.apptest2;

/**
 * Created by 5635512069 on 1/19/2018.
 */

public class EachMenu {
    private String tmove;
    private int times;
    private String unit;


    public EachMenu(String tmove, int times, String unit) {
        super();
        this.tmove = tmove;
        this.times = times;
        this.unit = unit;
    }

    public String getTmove() {
        return tmove;

    }

    public void setTmove(String tmove) {
        this.tmove = tmove;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
