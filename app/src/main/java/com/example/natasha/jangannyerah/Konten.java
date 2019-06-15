package com.example.natasha.jangannyerah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Konten {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String toString() {
        return (getData());
    }
}
