package com.a5635512069.apptest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Perday> mdaily;
    private ArrayList<Tmove> tdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tdata = new ArrayList<>();
        addtdata();
        mdaily = new ArrayList<>();
        addmdaily();
        for(int i = 0;i <tdata.size();i++)
        System.out.println(tdata.get(i).getId()
                +" " +tdata.get(i).getName()
                +" " +tdata.get(i).getEquip()
                +" " +tdata.get(i).getDes()
                +" " +tdata.get(i).getPictures()
                +" " +tdata.get(i).getType()
                +" " +tdata.get(i).getVideos());
        for (int j= 0; j < 5; j++) {
            System.out.println(mdaily.get(j).getDate());
            for (int k = 0; k < 2; k++){
               System.out.println(mdaily.get(j).getListMenu().get(k).getTmove()
                       +" "+mdaily.get(j).getListMenu().get(k).getTimes()
                       +" "+mdaily.get(j).getListMenu().get(k).getUnit());
            }

        }
    }

    private void addmdaily() {
        ArrayList<EachMenu> eachMenus = null;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++){
                EachMenu eachMenu = new EachMenu("A"+j,j,"a"+j);
                eachMenus.add(eachMenu);
            }
            Perday perday = new Perday(i,eachMenus);
            mdaily.add(perday);
        }

    }

    private void addtdata() {
        for (int i = 0; i < 5; i++) {
            Tmove tmove = new Tmove(i, "A" + i, "a" + i, "B" + i, i + 1, "b" + 1, "+");
            tdata.add(tmove);
        }


    }
}
