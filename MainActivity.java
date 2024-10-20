package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtAnim;
Button btnTranslate, btnAlpha, btnScale, btnRotate, btnLottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.txtText);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnLottie = findViewById(R.id.btnLottie);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                txtAnim.startAnimation(move);
            }
        });
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                txtAnim.startAnimation(scale);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                txtAnim.startAnimation(rotate);
            }
        });
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                txtAnim.startAnimation(alpha);
            }
        });
        btnLottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext;
                iNext = new Intent(MainActivity.this, lottieanimation.class);
                startActivity(iNext);
            }
        });
    }
}