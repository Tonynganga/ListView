package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listViewa;
    String [] mpesa = {"Safaricom+", "MPESA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewa = findViewById(R.id.listview);

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                mpesa
        );
        listViewa.setAdapter(adapter);
        listViewa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(getApplicationContext(), "You Clicked Safaricom+", Toast.LENGTH_SHORT).show();
                }
                if (position==1){
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
    }
}