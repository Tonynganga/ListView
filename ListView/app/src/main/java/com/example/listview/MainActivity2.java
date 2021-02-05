package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ListView listViewa;
    String [] mpesadetails = {"Send Money", "Withdraw Cash","Buy Airtime","Loans and Savings","Lipa na MPESA","My Account"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listViewa = findViewById(R.id.listview2);

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                mpesadetails
        );
        listViewa.setAdapter(adapter);
        listViewa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
    }
}