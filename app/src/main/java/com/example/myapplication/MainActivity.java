package com.example.myapplication;

import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlphaAnimation alphaAnimation=new AlphaAnimation(1,0);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setRepeatCount(5);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        ImageView imageView=findViewById(R.id.iv_main);
        View playButton=findViewById(R.id.fab_main);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Log.i(TAG, "onAnimationEnd: ");
           
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Log.i(TAG,"onAnimationREpeate");
            }
        });
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(alphaAnimation);

            }
        });
    }
}