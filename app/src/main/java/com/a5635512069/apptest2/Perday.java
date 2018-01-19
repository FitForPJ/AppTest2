package com.a5635512069.apptest2;

/**
 * Created by 5635512069 on 1/19/2018.
 */

import java.util.ArrayList;

public class Perday {
    int date;
    ArrayList<EachMenu> listMenu;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public ArrayList<EachMenu> getListMenu() {
        return listMenu;
    }

    public void setListMenu(ArrayList<EachMenu> listMenu) {
        this.listMenu = listMenu;
    }

    public Perday(int date, ArrayList<EachMenu> listMenu) {
        this.date = date;

        this.listMenu = listMenu;
    }
}
