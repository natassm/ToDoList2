package com.example.natasha.jangannyerah;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNotes extends AppCompatActivity {

    static final int REQUEST_CODE_ADD_NOTES = 101;
    static final int RESULT_CODE_ADD_NOTES = 201;

    private static final String TAG = "ListNotes";
    ListView listview;
    ArrayList<Konten> kontenList = new ArrayList<>();
    FloatingActionButton FB_add;

    private KontenListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);

        Log.d(TAG, "OnCreate: Started.");

        listview = findViewById(R.id.lv);

        adapter = new KontenListAdapter(this, R.layout.activity_detail_notes, kontenList);
        listview.setAdapter(adapter);

//        Toast.makeText(getApplicationContext(), "Data Tersimpan", Toast.LENGTH_SHORT).show();


        FB_add = findViewById(R.id.FBadd);
        FB_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListNotes.this, MainActivity.class);
                startActivityForResult(intent, REQUEST_CODE_ADD_NOTES);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_ADD_NOTES && resultCode == RESULT_CODE_ADD_NOTES && data != null) {
            Konten konten = new Konten(
                data.getStringExtra("title"),
                data.getStringExtra("description")
            );

            kontenList.add(konten);
            adapter.notifyDataSetChanged();
        }
    }
}
