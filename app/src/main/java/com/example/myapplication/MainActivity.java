package com.example.myapplication;

import android.media.Image;
import android.util.Log;
import android.view.View;
import android.view.animation.*;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View playButton=findViewById(R.id.fab_main);
        final ImageView imageView=findViewById(R.id.iv_main);

        RotateAnimation rotateAnimation=new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(1000);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            imageView.startAnimation(rotateAnimation);

            }
        });
    }
}