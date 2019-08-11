package com.example.demo.wellness_forever;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class splash_screen extends AppCompatActivity {

    private TextView logo;
    private static int splashTimeOut=2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo = (TextView) findViewById(R.id.logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash_screen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, splashTimeOut);
        Animation frombutton =AnimationUtils.loadAnimation(this,R.anim.frombutton);
        logo.setAnimation(frombutton);
    }
}
