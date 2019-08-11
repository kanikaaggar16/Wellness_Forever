package com.example.demo.wellness_forever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class pick_time extends AppCompatActivity {
    DatePicker picker;
    Button displayDate;
    TextView textview1;
    Button confirm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_time);

        textview1=(TextView)findViewById(R.id.textView1);
        picker=(DatePicker)findViewById(R.id.datePicker);
        displayDate=(Button)findViewById(R.id.button1);
        confirm = (Button)findViewById(R.id.button2);

        textview1.setText("Current Date: "+getCurrentDate());


        confirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(pick_time.this,pick_date.class);
                startActivity(intent);
            }

        });


        displayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                textview1.setText("Change Date: "+getCurrentDate());
            }

        });
        picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent=new Intent(pick_time.this,final_report.class);
                startActivityForResult(intent, 2);// Activity is started with requestCode 2
            }
        });
    }
    // Call Back method  to get the Message form other Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {
            String message=data.getStringExtra("MESSAGE");
            textview1.setText(message);
        }
    }


    public String getCurrentDate() {
        StringBuilder builder = new StringBuilder();
        ;
        builder.append((picker.getMonth() + 1) + "/");//month is 0 based
        builder.append(picker.getDayOfMonth() + "/");
        builder.append(picker.getYear());
        return builder.toString();
    }



}