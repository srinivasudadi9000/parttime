package com.example.admin.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Timer;
import java.util.TimerTask;

public class SimpleSplash_withbig_needle extends Activity {
    ImageView needle;
    int count = -1;
    LinearLayout image_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_splash_big_needle);
        needle = (ImageView) findViewById(R.id.needle);
        image_home = (LinearLayout) findViewById(R.id.mylinear);

        Animation rotation = AnimationUtils.loadAnimation(SimpleSplash_withbig_needle.this, R.anim.rotation);
        needle.startAnimation(rotation);

        //   image_home.setBackground(Color.alpha(R.color.yellow));
        //  image_home.setBackgroundColor(getResources().getColor(R.color.yellow));


    }
}
