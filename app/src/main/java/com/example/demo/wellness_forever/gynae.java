package com.example.demo.wellness_forever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import android.widget.Button;

public class gynae extends AppCompatActivity {
    private Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gynae);
        book = (Button)findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gynae.this,pick_time.class);
                startActivity(intent);
            }

        });
    }
}
