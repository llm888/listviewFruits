package com.example.wlw.myapplication;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by wlw on 2016/12/5.
 */
public class Fruits {



    private String title;
    private String desc;
    private  int imageID;

    public Fruits(int imageID,String title,String desc){
        this.title=title;
        this.imageID=imageID;
        this.desc=desc;
    }
  public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageID() {
        return imageID;
    }






}
