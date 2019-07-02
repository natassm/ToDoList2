package com.example.natasha.jangannyerah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Konten {

    private String title, addnotes;
    private boolean isSelected;

    public Konten(String title, String addnotes){
        this.title = title;
        this.addnotes = addnotes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddnotes() {
        return addnotes;
    }

    public void setAddnotes(String addnotes) {
        this.addnotes = addnotes;
    }

    @Override
    public String toString() {
        return "Konten{" +
                "title='" + title + '\'' +
                ", addnotes='" + addnotes + '\'' +
//                ", date='" + date + '\'' +
                '}';
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    //    private String data;
//
//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data){
//        this.data = data;
//    }
//
//    public String toString() {
//        return (getData());
//    }
}
