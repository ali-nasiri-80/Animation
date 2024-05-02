package com.example.myapplication;

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
        TranslateAnimation translateAnimation=new TranslateAnimation(Animation.RELATIVE_TO_PARENT,0,Animation.RELATIVE_TO_PARENT,0,Animation.RELATIVE_TO_PARENT,0,Animation.RELATIVE_TO_PARENT,.7f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new BounceInterpolator());

       final  ImageView imageView=findViewById(R.id.iv_main);
        View playButton=findViewById(R.id.fab_main);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"imageView clicked!",Toast.LENGTH_SHORT).show();
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(translateAnimation);

            }
        });
    }
}