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
        TranslateAnimation translateAnimation=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0,Animation.RELATIVE_TO_PARENT,-1,Animation.ABSOLUTE,0,Animation.ABSOLUTE,0);

        final ImageView imageView=findViewById(R.id.iv_main);

        RotateAnimation rotateAnimation=new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        AlphaAnimation alphaAnimation=new AlphaAnimation(1,0);
        AnimationSet animationSet=new AnimationSet(true);
        animationSet.setDuration(1000);
        animationSet.setInterpolator(new AccelerateInterpolator());
        animationSet.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            imageView.startAnimation(animationSet);

            }
        });
    }
}