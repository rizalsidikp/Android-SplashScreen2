package com.app.example.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Animation jalanBendera, zoomButton, kapalPergi;
    LinearLayout bendera, plane;
    Button play, about, help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jalanBendera = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bendera);
        zoomButton = AnimationUtils.loadAnimation(MainActivity.this, R.anim.buttonzoom);
        kapalPergi = AnimationUtils.loadAnimation(MainActivity.this, R.anim.kapalpergi);
        bendera = (LinearLayout) findViewById(R.id.bendera);
        plane = (LinearLayout) findViewById(R.id.plane);
        play= (Button) findViewById(R.id.play);
        about= (Button) findViewById(R.id.about);
        help= (Button) findViewById(R.id.help);

        bendera.startAnimation(jalanBendera);
        plane.startAnimation(kapalPergi);
        play.startAnimation(zoomButton);
        about.startAnimation(zoomButton);
        help.startAnimation(zoomButton);
    }
}
