package com.example.demo.wellness_forever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    //Textview textview ;
    private TextView logo;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = (TextView)findViewById(R.id.tuser);
        login = (Button)findViewById(R.id.blogin);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,resgisteration.class);
                startActivity(intent);
            }

    });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,find_doctor.class);
                startActivity(intent);
            }

        });

    }
}
