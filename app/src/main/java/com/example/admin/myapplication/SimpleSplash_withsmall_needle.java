package com.example.admin.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SimpleSplash_withsmall_needle extends Activity {
    ImageView image_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_splash_small_needle);
        image_home = (ImageView) findViewById(R.id.needle);

        Animation rotation = AnimationUtils.loadAnimation(SimpleSplash_withsmall_needle.this,R.anim.rotation);
        image_home.startAnimation(rotation);

    }
}
