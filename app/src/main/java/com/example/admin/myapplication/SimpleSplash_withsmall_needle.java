package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.RequiresApi;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SimpleSplash_withsmall_needle extends Activity {
    ImageView image_home;
    MediaPlayer ring;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_splash_small_needle);
        image_home = (ImageView) findViewById(R.id.needle);


        Animation rotation = AnimationUtils.loadAnimation(SimpleSplash_withsmall_needle.this, R.anim.rotation);
        image_home.startAnimation(rotation);

        selection(getIntent().getStringExtra("selected"));


    }

    public void selection(String selected) {
        switch (selected) {
            case "normal":
                break;
            case "withsound":
                ring = MediaPlayer.create(SimpleSplash_withsmall_needle.this, R.raw.tiktac);
                ring.start();
                break;

            case "vibrationwithsound":
                ring = MediaPlayer.create(SimpleSplash_withsmall_needle.this, R.raw.tiktac);
                ring.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(2000);

                break;
            case "onlyvibration":
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(3000);

                break;
            case "withsound_2":
                ring = MediaPlayer.create(SimpleSplash_withsmall_needle.this, R.raw.track_22);
                ring.start();
                break;
            case "vibrationwithsound_2":
                ring = MediaPlayer.create(SimpleSplash_withsmall_needle.this, R.raw.track_22);
                ring.start();
                vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(2000);

                break;
            case "withsound_3":
                ring = MediaPlayer.create(SimpleSplash_withsmall_needle.this, R.raw.track_3);
                ring.start();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        switch (getIntent().getStringExtra("selected")) {
            case "withsound":
                ring.stop();
                break;
            case "withsound_2":
                ring.stop();
                break;
            case "withsound_3":
                ring.stop();
                break;
            case "vibrationwithsound":
                ring.stop();
                break;
            case "vibrationwithsound_2":
                ring.stop();
                break;
        }

    }
}
