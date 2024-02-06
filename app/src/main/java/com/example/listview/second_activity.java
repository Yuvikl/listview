package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent in=getIntent();
        String result=in.getStringExtra("result");

        EditText txt=(EditText) findViewById(R.id.editTextTextPersonName);

        txt.setText(result);
    }
}