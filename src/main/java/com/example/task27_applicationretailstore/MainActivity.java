package com.example.task27_applicationretailstore;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {
    // Screen elements
    TextView tv;
    Button btnSldM;
    Button btnClr;
    Button btnMenu;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;

    private TextView tvs1;


    int[] tab = {60,65,70,75,80,85,90};


    String[] sign = {
            "Good product",
            "Great choice",
            "Like tetris",
            "Be creative",
            "Excellent item",
            "Try this",
            "Let's play",
            "Not so expensive",
            "Loving lego so much"
    };



    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find elements
        tv = (TextView) findViewById(R.id.tv_wit);
        btnMenu = (Button) findViewById(R.id.PopUpMenu);
        btnSldM = (Button) findViewById(R.id.btnSlideMenu);
        btnClr = (Button) findViewById(R.id.btnClr);

        img1= (ImageView) findViewById(R.id.image1);
        img2= (ImageView) findViewById(R.id.image2);
        img3= (ImageView) findViewById(R.id.image3);
        img4= (ImageView) findViewById(R.id.image4);
        img5= (ImageView) findViewById(R.id.image5);
        img6= (ImageView) findViewById(R.id.image6);

        tv1= (TextView) findViewById(R.id.tv1);
        tv2= (TextView) findViewById(R.id.tv2);
        tv3= (TextView) findViewById(R.id.tv3);
        tv4= (TextView) findViewById(R.id.tv4);
        tv5= (TextView) findViewById(R.id.tv5);
        tv6= (TextView) findViewById(R.id.tv6);

        tvs1= (TextView) findViewById(R.id.tvs1);


        btnMenu.setOnClickListener(viewClickListener);

        img1.setOnClickListener(pngClickListener);
        img2.setOnClickListener(pngClickListener);
        img3.setOnClickListener(pngClickListener);
        img4.setOnClickListener(pngClickListener);
        img5.setOnClickListener(pngClickListener);
        img6.setOnClickListener(pngClickListener);



        shuffleArray(tab, 5);
        shuffleArray(tab, 4);
        shuffleArray(tab, 3);
        shuffleArray(tab, 2);
        shuffleArray(tab, 1);


    }



    void shuffleArray(int[] num, int a) {
        if (a > 0)
        {
            Random rnd = new Random();
            int x = rnd.nextInt(a);
            int n;

            n = num[a];
            num[a] = num[x];
            num[x] = n;

        }

    }



    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // add menu items
        menu.add(0, 1, 3, "Lego Star Wars");
        menu.add(0, 2, 1, "Lego Architecture");
        menu.add(0, 3, 2, "Lego Brick Headz");
        menu.add(0, 7, 6, "Lego Creator Expert");
        menu.add(1, 4, 4, "Best sellers");
        menu.add(1, 5, 5, "Discounts");
        menu.add(1, 6, 0, "New products");
        return super.onCreateOptionsMenu(menu);
    }

*/
/*
    // refresh menu
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // menu items with group ID = 1 are visible, if CheckBox is selected
        menu.setGroupVisible(1, chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }
*/
/*
    // events onClick
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        // Print photos for menu item

        switch (item.getItemId()) {
            case 1:
                // itemid 1 images
                tv.setText("Lego Star Wars");
                img1.setImageResource(R.drawable.lego_sw1);
                img2.setImageResource(R.drawable.lego_sw2);
                img3.setImageResource(R.drawable.lego_sw3new);
                img4.setImageResource(R.drawable.lego_sw4dis);
                img5.setImageResource(R.drawable.lego_sw5best);
                img6.setImageResource(R.drawable.lego_sw6new);
                break;
            case 2:
                // itemid 2 images
                tv.setText("Lego Architecture");
                img1.setImageResource(R.drawable.lego_a1dis);
                img2.setImageResource(R.drawable.lego_a2);
                img3.setImageResource(R.drawable.lego_a3best);
                img4.setImageResource(R.drawable.lego_a4dis);
                img5.setImageResource(R.drawable.lego_a5best);
                img6.setImageResource(R.drawable.lego_a6new);
                break;
            case 3:
                // itemid 3 images
                tv.setText("Lego Brick Headz");
                img1.setImageResource(R.drawable.lego_bh1);
                img2.setImageResource(R.drawable.lego_bh2);
                img3.setImageResource(R.drawable.lego_bh3new);
                img4.setImageResource(R.drawable.lego_bh4dis);
                img5.setImageResource(R.drawable.lego_bh5best);
                img6.setImageResource(R.drawable.lego_bh6new);
                break;
            case 4:
                // itemid 4 images
                tv.setText("Best sellers");
                img1.setImageResource(R.drawable.lego_a3best);
                img2.setImageResource(R.drawable.lego_a5best);
                img3.setImageResource(R.drawable.lego_ce3best);
                img4.setImageResource(R.drawable.lego_ce5best);
                img5.setImageResource(R.drawable.lego_sw5best);
                img6.setImageResource(R.drawable.lego_bh5best);
                break;

            case 5:
                // itemid 5 images
                tv.setText("Discounts");
                img1.setImageResource(R.drawable.lego_ce1dis);
                img2.setImageResource(R.drawable.lego_ce4dis);
                img3.setImageResource(R.drawable.lego_a1dis);
                img4.setImageResource(R.drawable.lego_a4dis);
                img5.setImageResource(R.drawable.lego_sw4dis);
                img6.setImageResource(R.drawable.lego_bh4dis);
                break;
            case 6:
                // itemid 6 images
                tv.setText("New products");
                img1.setImageResource(R.drawable.lego_a6new);
                img2.setImageResource(R.drawable.lego_bh6new);
                img3.setImageResource(R.drawable.lego_bh3new);
                img4.setImageResource(R.drawable.lego_sw3new);
                img5.setImageResource(R.drawable.lego_sw6new);
                img6.setImageResource(R.drawable.lego_ce6new);
                break;

            case 7:
                // itemid 7 images
                tv.setText("Lego Creator Expert");
                img1.setImageResource(R.drawable.lego_ce1dis);
                img2.setImageResource(R.drawable.lego_ce2);
                img3.setImageResource(R.drawable.lego_ce3best);
                img4.setImageResource(R.drawable.lego_ce4dis);
                img5.setImageResource(R.drawable.lego_ce5best);
                img6.setImageResource(R.drawable.lego_ce6new);
                break;

        }

*/
    public void onClickClr(View v) {
        // define button handler by id

        // button Clr
        tv.setText("Witamy ponownie w naszym sklepie  :)");
        img1.setImageResource(0);
        img2.setImageResource(0);
        img3.setImageResource(0);
        img4.setImageResource(0);
        img5.setImageResource(0);
        img6.setImageResource(0);

        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");

        tvs1.setText("");


    }


    public void onClickSldM(View v) {
        // define button handler by id
        // button btnSlideMenu

        Intent intentM = new Intent(this, Slide_Menu.class);
        startActivity(intentM);

    }

    View.OnClickListener pngClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Random rnd = new Random();

            tvs1.setText(sign[rnd.nextInt(7)]);

        }

    };

    View.OnClickListener viewClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            showPopupMenu(v);
        }


    };


    private void showPopupMenu(View v) {
        PopupMenu menu = new PopupMenu(this, v);
        menu.inflate(R.menu.main_menu);

        menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {



            @Override
            public boolean onMenuItemClick(MenuItem item) {

                int x  = 10;
                switch (item.getItemId()) {
                    case R.id.menu_lego ^ R.id.menu_oc:
                        return true;
                    case R.id.menu_a:
                        tv.setText("Lego Architecture");
                        img1.setImageResource(R.drawable.lego_a1dis);
                        img2.setImageResource(R.drawable.lego_a2);
                        img3.setImageResource(R.drawable.lego_a3best);
                        img4.setImageResource(R.drawable.lego_a4dis);
                        img5.setImageResource(R.drawable.lego_a5best);
                        img6.setImageResource(R.drawable.lego_a6new);

                        tv1.setText("11111 -> " + (100+x+1) );
                        tv2.setText("22122 -> " + (100+x+2) );
                        tv3.setText("33133 -> " + (100+x+3) );
                        tv4.setText("44144 -> " + (100+x+4) );
                        tv5.setText("55155 -> " + (100+x+5) );
                        tv6.setText("66166 -> " + (100+x+6) );

                        Toast.makeText(getApplicationContext(),
                                "Architecture",
                                Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menu_bh:
                        tv.setText("Lego Brick Headz");
                        img1.setImageResource(R.drawable.lego_bh1);
                        img2.setImageResource(R.drawable.lego_bh2);
                        img3.setImageResource(R.drawable.lego_bh3new);
                        img4.setImageResource(R.drawable.lego_bh4dis);
                        img5.setImageResource(R.drawable.lego_bh5best);
                        img6.setImageResource(R.drawable.lego_bh6new);

                        tv1.setText("11311 -> " + (100+2*x+1) );
                        tv2.setText("22322 -> " + (100+2*x+2) );
                        tv3.setText("33333 -> " + (100+2*x+3) );
                        tv4.setText("44344 -> " + (100+2*x+4) );
                        tv5.setText("55355 -> " + (100+2*x+5) );
                        tv6.setText("66366  -> " + (100+2*x+6) );

                        Toast.makeText(getApplicationContext(),
                                "Brick Headz",
                                Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menu_sw:
                        tv.setText("Lego Star Wars");
                        img1.setImageResource(R.drawable.lego_sw1);
                        img2.setImageResource(R.drawable.lego_sw2);
                        img3.setImageResource(R.drawable.lego_sw3new);
                        img4.setImageResource(R.drawable.lego_sw4dis);
                        img5.setImageResource(R.drawable.lego_sw5best);
                        img6.setImageResource(R.drawable.lego_sw6new);

                        tv1.setText("11211 -> " + (100+3*x+1) );
                        tv2.setText("22222 -> " + (100+3*x+2) );
                        tv3.setText("33233 -> " + (100+3*x+3) );
                        tv4.setText("44244 -> " + (100+3*x+4) );
                        tv5.setText("55255 -> " + (100+3*x+5) );
                        tv6.setText("66266 -> " + (100+3*x+6) );

                        Toast.makeText(getApplicationContext(),
                                "Star Wars",
                                Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menu_ce:
                        tv.setText("Creator Expert");
                        img1.setImageResource(R.drawable.lego_ce1dis);
                        img2.setImageResource(R.drawable.lego_ce2);
                        img3.setImageResource(R.drawable.lego_ce3best);
                        img4.setImageResource(R.drawable.lego_ce4dis);
                        img5.setImageResource(R.drawable.lego_ce5best);
                        img6.setImageResource(R.drawable.lego_ce6new);

                        tv1.setText("11411 -> " + (100+4*x+1) );
                        tv2.setText("22422 -> " + (100+4*x+2) );
                        tv3.setText("33433 -> " + (100+4*x+3) );
                        tv4.setText("44444 -> " + (100+4*x+4) );
                        tv5.setText("55455 -> " + (100+4*x+5) );
                        tv6.setText("66466 -> " + (100+4*x+6) );
                        Toast.makeText(getApplicationContext(),
                                "Creator Expert",
                                Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menu_oc_dis:
                        tv.setText("Discounts");
                        img1.setImageResource(R.drawable.lego_ce1dis);
                        img2.setImageResource(R.drawable.lego_ce4dis);
                        img3.setImageResource(R.drawable.lego_a1dis);
                        img4.setImageResource(R.drawable.lego_a4dis);
                        img5.setImageResource(R.drawable.lego_sw4dis);
                        img6.setImageResource(R.drawable.lego_bh4dis);

                        tv1.setText("dis 1 -> " + (100+1) );
                        tv2.setText("dis 2 -> " + (100+2) );
                        tv3.setText("dis 3 -> " + (100+3) );
                        tv4.setText("dis 4 -> " + (100+4) );
                        tv5.setText("dis 5 -> " + (100+5) );
                        tv6.setText("dis 6 -> " + (100+6) );

                        Toast.makeText(getApplicationContext(),
                                "Discounts",
                                Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menu_oc_bs:
                        tv.setText("Best sellers today");
                        tv1.setText("dis 1 -> " + (100+x+3) );
                        tv2.setText("dis 2 -> " + (100+x+5) );
                        tv3.setText("dis 3 -> " + (100+4*x+3) );
                        tv4.setText("dis 4 -> " + (100+4*x+5) );
                        tv5.setText("dis 5 -> " + (100+3*x+3) );
                        tv6.setText("dis 6 -> " + (100+3*x+5) );

                        img1.setImageResource(R.drawable.lego_a3best);
                        img2.setImageResource(R.drawable.lego_a5best);
                        img3.setImageResource(R.drawable.lego_ce3best);
                        img4.setImageResource(R.drawable.lego_ce5best);
                        img5.setImageResource(R.drawable.lego_sw5best);
                        img6.setImageResource(R.drawable.lego_bh5best);

                        Toast.makeText(getApplicationContext(),
                                "Best Sellers",
                                Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menu_special:

                        img1.setImageResource(R.drawable.lego_bh2);
                        img2.setImageResource(R.drawable.lego_sw2);
                        img3.setImageResource(R.drawable.lego_a2);
                        img4.setImageResource(R.drawable.lego_ce2);
                        img5.setImageResource(0);
                        img6.setImageResource(0);


                        tv.setText("Special for you");
                        tv1.setText("special 1 -> " + tab[0] );
                        tv2.setText("special 2 -> " + tab[1] );
                        tv3.setText("special 3 -> " + tab[2] );
                        tv4.setText("special 4 -> " + tab[3] );
                        tv5.setText("");
                        tv6.setText("");


                        Toast.makeText(getApplicationContext(),
                                "Special for you",
                                Toast.LENGTH_SHORT).show();
                        return true;

                    default:
                        img1.setImageResource(0);
                        img2.setImageResource(0);
                        img3.setImageResource(0);
                        img4.setImageResource(0);
                        img5.setImageResource(0);
                        img6.setImageResource(0);

                        tv1.setText("");
                        tv2.setText("");
                        tv3.setText("");
                        tv4.setText("");
                        tv5.setText("");
                        tv6.setText("");

                        tvs1.setText("");
                        return false;
                }
            }
        });




        menu.setOnDismissListener(new PopupMenu.OnDismissListener() {
            @Override
            public void onDismiss(PopupMenu menu) {



                Toast.makeText(getApplicationContext(), "onDismiss",
                        Toast.LENGTH_SHORT).show();
            }
        });

        menu.show();
    }


}


