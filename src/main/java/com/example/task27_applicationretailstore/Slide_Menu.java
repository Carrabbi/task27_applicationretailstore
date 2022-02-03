package com.example.task27_applicationretailstore;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Slide_Menu extends AppCompatActivity {


    private Button btnBack;
    private Button btnRpt;
    private ImageView img1;
    private Animation an;
    private TextView tv_lego;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide__menu);

        tv_lego = (TextView) findViewById(R.id.tv_lego);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnRpt = (Button) findViewById(R.id.btnRpt);

        img1 = (ImageView) findViewById(R.id.image1);

        ObjectAnimator tv_lego_an = ObjectAnimator.ofFloat(tv_lego,"scaleY", 0,5f, 2.0f);
        tv_lego_an.setDuration(1500);
        tv_lego_an.setRepeatCount(tv_lego_an.INFINITE);
        tv_lego_an.setRepeatMode(tv_lego_an.REVERSE);
        tv_lego_an.start();

    }


    public void onClickBack(View v) {
        // define button handler by id
        // button Slide_1

        Intent intentB= new Intent(this, MainActivity.class);
        startActivity(intentB);

    }

    public void onClickRepeat(View v) {
        // define button handler by id
        // button Repeat


        an = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        img1.startAnimation(an);

    }

    public void onClickImg(View v) {

        an = AnimationUtils.loadAnimation(this, R.anim.blink);
        img1.startAnimation(an);

    }

    public void onClickSlide_1(View v) {
        // define button handler by id
        // button Slide_1

        Intent intent1 = new Intent(this, Slide_1.class);
        startActivity(intent1);


    }

    public void onClickSlide_2(View v) {
        // define button handler by id
        // button btnSlide_2

        Intent intent2 = new Intent(this, Slide_2.class);
        startActivity(intent2);

    }


    public void onClickSlide_3(View v) {
        // define button handler by id
        // button Slide_3

        Intent intent3 = new Intent(this, Slide_3.class);
        startActivity(intent3);

    }


}