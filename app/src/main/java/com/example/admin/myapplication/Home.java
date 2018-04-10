package com.example.admin.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends Activity implements View.OnClickListener {
    Button simplesplash, simplesplash_withsmallanim, simplesplash_withbiganim, simplesplash_withsmallneedle, simplesplash_withbigneedle, simplesplash_withbigneedlewithcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        simplesplash = (Button) findViewById(R.id.simplesplash);
        simplesplash_withsmallanim = (Button) findViewById(R.id.simplesplash_withsmallanim);
        simplesplash_withbiganim = (Button) findViewById(R.id.simplesplash_withbiganim);
        simplesplash_withsmallneedle = (Button) findViewById(R.id.simplesplash_withsmallneedle);
        simplesplash_withbigneedle = (Button) findViewById(R.id.simplesplash_withbigneedle);
        simplesplash_withbigneedlewithcolor = (Button) findViewById(R.id.simplesplash_withbigneedlewithcolor);

        simplesplash_withsmallneedle.setOnClickListener(this);
        simplesplash.setOnClickListener(this);
        simplesplash_withsmallanim.setOnClickListener(this);
        simplesplash_withbiganim.setOnClickListener(this);
        simplesplash_withbigneedle.setOnClickListener(this);
        simplesplash_withbigneedlewithcolor.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.simplesplash:
                simplesplash.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                Intent simplesplash1 = new Intent(Home.this, SimpleSplash.class);
                startActivity(simplesplash1);
                break;
            case R.id.simplesplash_withbiganim:
                simplesplash_withbiganim.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                Intent simplesplash_small1 = new Intent(Home.this, SimpleSplash_withbig_anim.class);
                startActivity(simplesplash_small1);
                break;
            case R.id.simplesplash_withsmallanim:
                simplesplash_withsmallanim.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                Intent simplesplash_withsmallanim1 = new Intent(Home.this, SimpleSplash_withsmall_anim.class);
                startActivity(simplesplash_withsmallanim1);
                break;
            case R.id.simplesplash_withsmallneedle:
                simplesplash_withsmallneedle.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                Intent simplesplash_withsmallneedle1 = new Intent(Home.this, SimpleSplash_withsmall_needle.class);
                startActivity(simplesplash_withsmallneedle1);
                break;
            case R.id.simplesplash_withbigneedle:
                simplesplash_withbigneedle.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                Intent simplesplash_withbigneedle1 = new Intent(Home.this, SimpleSplash_withbig_needle.class);
                startActivity(simplesplash_withbigneedle1);
                break;
            case R.id.simplesplash_withbigneedlewithcolor:
                simplesplash_withbigneedlewithcolor.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                Intent simplesplash_withbigneedlewithcolor1 = new Intent(Home.this, SimpleSplash_withbig_needle_withcolor.class);
                startActivity(simplesplash_withbigneedlewithcolor1);
                break;
        }

    }
}
