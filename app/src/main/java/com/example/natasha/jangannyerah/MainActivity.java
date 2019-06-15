package com.example.natasha.jangannyerah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit_text;
    Button btn;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.BTN);
        edit_text = (EditText) findViewById(R.id.ET);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ListNotes.class);

                st = edit_text.getText().toString();
                intent.putExtra("Value", st);
                startActivity(intent);
                finish();
            }
        });
    }
}
