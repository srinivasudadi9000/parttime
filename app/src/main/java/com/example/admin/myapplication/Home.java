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

public class Home extends Activity implements View.OnClickListener{
  Button simplesplash,simplesplash_withsmallanim,simplesplash_withbiganim;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
         simplesplash= (Button) findViewById(R.id.simplesplash);
         simplesplash_withsmallanim= (Button) findViewById(R.id.simplesplash_withsmallanim);
         simplesplash_withbiganim= (Button) findViewById(R.id.simplesplash_withbiganim);

         simplesplash.setOnClickListener(this);
         simplesplash_withsmallanim.setOnClickListener(this);
         simplesplash_withbiganim.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.simplesplash:
                Intent simplesplash = new Intent(Home.this,SimpleSplash.class);
                startActivity(simplesplash);
                break;
            case R.id.simplesplash_withbiganim:
                Intent simplesplash_small = new Intent(Home.this,SimpleSplash_withbig_anim.class);
                startActivity(simplesplash_small);
                break;
            case R.id.simplesplash_withsmallanim:
                Intent simplesplash_withsmallanim = new Intent(Home.this,SimpleSplash_withsmall_anim.class);
                startActivity(simplesplash_withsmallanim);
                break;
        }
    }
}
