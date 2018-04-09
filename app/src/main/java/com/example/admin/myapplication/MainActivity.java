package com.example.admin.myapplication;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    ImageView partime_txt, rocket_img, myimage_gif, company_img;
    RelativeLayout myrelative_ll, wayside_rl;
    AnimatorSet set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         partime_txt = (ImageView) findViewById(R.id.partime_txt);
        rocket_img = (ImageView) findViewById(R.id.rocket_img);
        myimage_gif = (ImageView) findViewById(R.id.myimage_gif);
        company_img = (ImageView) findViewById(R.id.company_img);
        myrelative_ll = (RelativeLayout) findViewById(R.id.myrelative_ll);
        wayside_rl = (RelativeLayout) findViewById(R.id.wayside_rl);

        Animation slideup = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
        myimage_gif.startAnimation(slideup);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                myrelative_ll.setVisibility(View.VISIBLE);
                Animation slideup = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slideup);
                myrelative_ll.startAnimation(slideup);
              /*

               *//* Animation rotation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotation);
                rocket_img.startAnimation(rotation);*//*
                rocket_img.setImageDrawable(getResources().getDrawable(R.drawable.rocket_mama));
                set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.rotation);
                set.setTarget(rocket_img);
                set.start();*/
            }
        }, 2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                myrelative_ll.setVisibility(View.GONE);

                wayside_rl.setVisibility(View.VISIBLE);
                Animation logoMoveAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_normal);
                wayside_rl.startAnimation(logoMoveAnimation);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent home = new Intent(MainActivity.this,Home.class);
                        startActivity(home);
                    }
                },3000);

            }
        }, 3200);

    }
}
