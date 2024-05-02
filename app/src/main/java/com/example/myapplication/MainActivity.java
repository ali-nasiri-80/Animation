package com.example.myapplication;

import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScaleAnimation scaleAnimation=new ScaleAnimation(1,2,1,2,Animation.RELATIVE_TO_SELF,.5f,Animation.RELATIVE_TO_SELF,.5f);
        scaleAnimation.setDuration(1000);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        scaleAnimation.setRepeatMode(Animation.REVERSE);

       final  ImageView imageView=findViewById(R.id.iv_main);
        View playButton=findViewById(R.id.fab_main);
        scaleAnimation.setDuration(1000);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(scaleAnimation);

            }
        });
    }
}