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
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Slide_2 extends AppCompatActivity {

    private Button btnBack;
    private Button btnSldM;
    private Button btnRpt;
    private ImageView img1;
    private TextView tv1;
    private Button btnLast;
    private Button btnNext;
    private RelativeLayout RelLayC;
    private Animation an;
    private TextView tv_lego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_2);

        tv_lego = (TextView) findViewById(R.id.tv_lego);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnSldM = (Button) findViewById(R.id.btnSlideMenu);
        btnRpt = (Button) findViewById(R.id.btnRpt);

        img1= (ImageView) findViewById(R.id.image1);

        tv1= (TextView) findViewById(R.id.tv1);



        btnLast = (Button) findViewById(R.id.btnLast);
        btnNext = (Button) findViewById(R.id.btnNext);


        RelLayC = (RelativeLayout) findViewById(R.id.RelLayContent);


        an = AnimationUtils.loadAnimation(this, R.anim.movement_up);
        img1.startAnimation(an);
        RelLayC.startAnimation(an);

        ObjectAnimator tv_lego_an = ObjectAnimator.ofFloat(tv_lego,"scaleY", 0,5f, 2.0f);
        tv_lego_an.setDuration(1500);
        tv_lego_an.setRepeatCount(tv_lego_an.INFINITE);
        tv_lego_an.setRepeatMode(tv_lego_an.REVERSE);
        tv_lego_an.start();

    }

    public void onClickSldM(View v) {
        // define button handler by id
        // button btnSlideMenu

        Intent intentM = new Intent(this, Slide_Menu.class);
        startActivity(intentM);

    }

    public void onClickRepeat(View v) {
        // define button handler by id
        // button Repeat
        an = AnimationUtils.loadAnimation(this, R.anim.movement_up);

        img1.startAnimation(an);
        RelLayC.startAnimation(an);

    }

    public void onClickImg(View v) {

        an = AnimationUtils.loadAnimation(this, R.anim.rotation);
        img1.startAnimation(an);


    }


    public void onClickLast(View v) {
        // define button handler by id
        // button Last
        Intent intentLast = new Intent(this, Slide_1.class);
        startActivity(intentLast);

    }


    public void onClickNext(View v) {
        // define button handler by id
        // button Next

        Intent intentNext = new Intent(this, Slide_3.class);
        startActivity(intentNext);

    }

}