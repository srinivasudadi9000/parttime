package com.example.admin.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class SimpleSplash_withbig_needle_withcolor extends Activity {
    ImageView needle;
    int count=-1;
    LinearLayout image_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_splash_big_needle_withcolor);
        needle = (ImageView) findViewById(R.id.needle);
        image_home = (LinearLayout) findViewById(R.id.mylinear);

        Animation rotation = AnimationUtils.loadAnimation(SimpleSplash_withbig_needle_withcolor.this,R.anim.rotation);
        needle.startAnimation(rotation);

     //   image_home.setBackground(Color.alpha(R.color.yellow));
      //  image_home.setBackgroundColor(getResources().getColor(R.color.yellow));


           callme();

    }
    public void setBackground(int count){
        switch (count){
            case 0:
                image_home.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            case 1:
                image_home.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case 2:
                image_home.setBackgroundColor(getResources().getColor(R.color.brick));
                break;
            case 3:
                image_home.setBackgroundColor(getResources().getColor(R.color.software));
                break;
            case 4:
                image_home.setBackgroundColor(getResources().getColor(R.color.services));
                break;
            case 5:
                image_home.setBackgroundColor(getResources().getColor(R.color.training));
                break;
            case 6:
                image_home.setBackgroundColor(getResources().getColor(R.color.project));
                break;
            case 7:
                image_home.setBackgroundColor(getResources().getColor(R.color.office));
                break;
            case 8:
                image_home.setBackgroundColor(getResources().getColor(R.color.malls));
                break;
            case 9:
                image_home.setBackgroundColor(getResources().getColor(R.color.agri));
                break;
            case 10:
                image_home.setBackgroundColor(getResources().getColor(R.color.officeboy));
                break;
            case 11:
                count = -1;
                image_home.setBackgroundColor(getResources().getColor(R.color.hotel));
                callme();
                break;


        }

    }
    public void callme(){
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                count ++;
                if (count == 11){
                    count = -1;
                }
                setBackground(count);
            }
        }, 0, 650);//put here time 1000 milliseconds=1 second

    }
}
