package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    TextView textnumber, textamount;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnsend = (Button)findViewById(R.id.btnsubmit);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textnumber = (EditText)findViewById(R.id.number);
                textamount = (EditText)findViewById(R.id.amount);

                int phonenumber = Integer.parseInt(textnumber.getText().toString());
                int amount = Integer.parseInt(textamount.getText().toString());

                if (amount > 1000 && phonenumber == 0722114014) {
                    Toast.makeText(getApplicationContext(), "Money Sent!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Phone Number or Amount is Invalid", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}