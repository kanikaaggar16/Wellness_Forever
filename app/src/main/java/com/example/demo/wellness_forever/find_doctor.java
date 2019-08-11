package com.example.demo.wellness_forever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


public class find_doctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);
        CardView card1 = (CardView) findViewById(R.id.cardio);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,cardio.class);
                startActivity(intent);

            }
        });

        CardView card2 = (CardView) findViewById(R.id.dentist);

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,dentist.class);
                startActivity(intent);
            }
        });

        CardView card3 = (CardView) findViewById(R.id.derma);

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,dermatologist.class);
                startActivity(intent);

            }
        });

        CardView card4 = (CardView) findViewById(R.id.eye);

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,eye.class);
                startActivity(intent);

            }
        });

        CardView card5 = (CardView) findViewById(R.id.gynae);

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,gynae.class);
                startActivity(intent);

            }
        });

        CardView card6 = (CardView) findViewById(R.id.neuro);

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,neurologist.class);
                startActivity(intent);

            }
        });


        CardView card7 = (CardView) findViewById(R.id.child);

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,child.class);
                startActivity(intent);

            }
        });


        CardView card8 = (CardView) findViewById(R.id.ent);

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,ent.class);
                startActivity(intent);

            }
        });

        CardView card9 = (CardView) findViewById(R.id.ortho);

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,ortho.class);
                startActivity(intent);

            }
        });

        CardView card10 = (CardView) findViewById(R.id.physio);

        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(find_doctor.this,physio.class);
                startActivity(intent);

            }
        });


    }
}
