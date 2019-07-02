package com.example.natasha.jangannyerah;

import android.content.ClipData;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class KontenViewHolder extends RecyclerView.ViewHolder{
    private TextView TV_1, TV_2;
    CheckBox cb;
    Button btnDel;

    public KontenViewHolder(View itemView){
        super(itemView);
        TV_1 = itemView.findViewById(R.id.TV1);
        TV_2 = itemView.findViewById(R.id.TV2);
        cb = itemView.findViewById(R.id.cb);
        btnDel = itemView.findViewById(R.id.btnDel);
    }

    public void setUpDataToUI(Konten konten) {
        TV_1.setText(konten.getTitle());
        TV_2.setText(konten.getAddnotes());
        cb.setChecked(konten.isSelected());
    }
}
