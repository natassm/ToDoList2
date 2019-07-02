package com.example.natasha.jangannyerah;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class KontenListAdapter extends RecyclerView.Adapter<KontenViewHolder> {

    private ArrayList<Konten> kontenList;


    public KontenListAdapter(ArrayList<Konten> kontenList){
        this.kontenList = kontenList;
    }

    @Override
    public KontenViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_detail_notes, parent, false);
        return new KontenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KontenViewHolder holder, final int position){
        final int pos = position;
        holder.setUpDataToUI(kontenList.get(position));
        holder.cb.setTag(kontenList.get(position));

        holder.cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;
                Konten konten = (Konten) cb.getTag();

                konten.setSelected(cb.isChecked());
                kontenList.get(pos).setSelected(cb.isChecked());
            }
        });

        holder.btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteItemfromList(v, pos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return kontenList.size();
    }

    private void deleteItemfromList(View v, final int position){
        AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());

        builder.setMessage("Delete Item?")
                .setCancelable(false)
                .setPositiveButton("CONFIRM",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                kontenList.remove(position);
                                notifyDataSetChanged();
                            }
                        })
                .setNegativeButton("CANCEL",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });
                builder.show();
    }

//    public void delete(int position){
//        kontenList.remove(position);
//        notifyItemRemoved(position);
//    }

//    @NonNull
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        String title = getItem(position).getTitle();
//        String addnotes = getItem(position).getAddnotes();
//
//        Konten myKonten = new Konten(title,addnotes);
//
//        LayoutInflater inflater = LayoutInflater.from(mContext);
//        convertView = inflater.inflate(mResource, parent, false);
//
//        TextView TV_1 = (TextView) convertView.findViewById(R.id.TV1);
//        TextView TV_2 = (TextView) convertView.findViewById(R.id.TV2);
//
//        TV_1.setText(title);
//        TV_2.setText(addnotes);
//
//        return convertView;
//    }
}
