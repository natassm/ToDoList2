package com.example.natasha.jangannyerah;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNotes extends AppCompatActivity {

    ListView listview;
    List kontenList = new ArrayList<>();
    ArrayAdapter adapter = null;
//    ArrayList<String> arrayList;
//    ArrayAdapter<String> adapter;
    String st;
    FloatingActionButton FB_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);

        listview = (ListView) findViewById(R.id.lv);


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , kontenList);
        listview.setAdapter(adapter);

        st = getIntent().getExtras().getString("Value");

        Konten myKonten = new Konten();
        myKonten.setData(st);
        adapter.add(myKonten);
        Toast.makeText(getApplicationContext(), "Data Tersimpan", Toast.LENGTH_SHORT).show();


        FB_add = (FloatingActionButton) findViewById(R.id.FBadd);
        FB_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListNotes.this, MainActivity.class));
            }
        });
    }
}
