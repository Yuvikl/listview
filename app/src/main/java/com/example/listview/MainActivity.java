package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arr={"India","China","Japan"};

        ArrayAdapter<String> adp=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arr);

        ListView lv=(ListView) findViewById(R.id.listview);
        lv.setAdapter(adp);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str=(String) lv.getItemAtPosition(i);

                Toast.makeText(getApplicationContext(),"The country : "+str,Toast.LENGTH_LONG).show();

            }
        });

    }
}