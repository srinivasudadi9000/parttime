package com.example.admin.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SimpleSplash extends Activity {
    ImageView image_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_splash);
        image_home = (ImageView) findViewById(R.id.image_home);
       /* Animation rotation = AnimationUtils.loadAnimation(SimpleSplash.this,R.anim.blinking);
        image_home.startAnimation(rotation);

        Animation rr = AnimationUtils.loadAnimation(SimpleSplash.this,R.anim.rotation);
        image_home.startAnimation(rr);*/

    }
}
