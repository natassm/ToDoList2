package com.example.natasha.jangannyerah;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class KontenViewHolder extends RecyclerView.ViewHolder{
    private TextView TV_1, TV_2;

    public KontenViewHolder(View itemView){
        super(itemView);
        TV_1 = itemView.findViewById(R.id.TV1);
        TV_2 = itemView.findViewById(R.id.TV2);
    }

    public void setUpDataToUI(Konten konten) {
        TV_1.setText(konten.getTitle());
        TV_2.setText(konten.getAddnotes());
    }
}
