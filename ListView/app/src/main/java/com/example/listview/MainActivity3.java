package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    ListView listViewsend;
    String [] mpesasend = {"Search Sim Contact", "Enter Phone Number"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listViewsend = findViewById(R.id.listview3);

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                mpesasend
        );
        listViewsend.setAdapter(adapter);
        listViewsend.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(getApplicationContext(), "You Clicked Search Contacts", Toast.LENGTH_SHORT).show();
                }
                if (position==1){
                    Intent intent = new Intent(getApplicationContext(),MainActivity4.class);
                    startActivity(intent);
                }
            }
        });
    }
}