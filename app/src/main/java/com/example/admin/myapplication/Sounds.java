package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sounds extends Activity implements View.OnClickListener{
   Button normal,withsound,onlyvibration,vibrationwithsound,withsound_2,withsound_3,vibrationwithsound_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sounds);
        normal = (Button) findViewById(R.id.normal);
        withsound = (Button) findViewById(R.id.withsound);
        withsound_2 = (Button) findViewById(R.id.withsound_2);
        withsound_3 = (Button) findViewById(R.id.withsound_3);
        onlyvibration = (Button) findViewById(R.id.onlyvibration);
        vibrationwithsound = (Button) findViewById(R.id.vibrationwithsound);
        vibrationwithsound_2 = (Button) findViewById(R.id.vibrationwithsound_2);

        normal.setOnClickListener(this);
        withsound.setOnClickListener(this);
        withsound_2.setOnClickListener(this);
        withsound_3.setOnClickListener(this);
        onlyvibration.setOnClickListener(this);
        vibrationwithsound.setOnClickListener(this);
        vibrationwithsound_2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.normal:
                Intent normal = new Intent(Sounds.this,SimpleSplash_withsmall_needle.class);
                normal.putExtra("selected","normal");
                startActivity(normal);
                break;
            case R.id.withsound:
                Intent withsound = new Intent(Sounds.this,SimpleSplash_withsmall_needle.class);
                withsound.putExtra("selected","withsound");
                startActivity(withsound);
                break;
            case R.id.withsound_2:
                Intent withsound_2 = new Intent(Sounds.this,SimpleSplash_withsmall_needle.class);
                withsound_2.putExtra("selected","withsound_2");
                startActivity(withsound_2);
                break;
            case R.id.withsound_3:
                Intent withsound_3 = new Intent(Sounds.this,SimpleSplash_withsmall_needle.class);
                withsound_3.putExtra("selected","withsound_3");
                startActivity(withsound_3);
                break;
            case R.id.onlyvibration:
                Intent onlyvibration = new Intent(Sounds.this,SimpleSplash_withsmall_needle.class);
                onlyvibration.putExtra("selected","onlyvibration");
                startActivity(onlyvibration);
                break;
            case R.id.vibrationwithsound:
                Intent vibrationwithsound = new Intent(Sounds.this,SimpleSplash_withsmall_needle.class);
                vibrationwithsound.putExtra("selected","vibrationwithsound");
                startActivity(vibrationwithsound);
                break;
            case R.id.vibrationwithsound_2:
                Intent vibrationwithsound_2 = new Intent(Sounds.this,SimpleSplash_withsmall_needle.class);
                vibrationwithsound_2.putExtra("selected","vibrationwithsound_2");
                startActivity(vibrationwithsound_2);
                break;

        }
    }
}
