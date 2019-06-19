package com.example.natasha.jangannyerah;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class KontenListAdapter extends ArrayAdapter<Konten> {

    private static final String TAG = "KontenListAdapter";

    private Context mContext;
    int mResource;

    public KontenListAdapter(Context context, int resource, ArrayList<Konten> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String title = getItem(position).getTitle();
        String addnotes = getItem(position).getAddnotes();

        Konten myKonten = new Konten(title,addnotes);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView TV_1 = (TextView) convertView.findViewById(R.id.TV1);
        TextView TV_2 = (TextView) convertView.findViewById(R.id.TV2);

        TV_1.setText(title);
        TV_2.setText(addnotes);

        return convertView;
    }
}
