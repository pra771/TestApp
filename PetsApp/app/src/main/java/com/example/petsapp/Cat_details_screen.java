package com.example.petsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Cat_details_screen extends AppCompatActivity {

    Button btnadtopcat;

    ViewFlipper filpper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_details_screen);

        btnadtopcat = findViewById(R.id.btn_catadopme);

        btnadtopcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cat_details_screen.this,Cat_Adope_Screen.class);
                startActivity(intent);
            }
        });

        int imgarry[] = {
                R.mipmap.catslide,R.mipmap.catslider1,R.mipmap.catslider2
        };
        filpper = findViewById(R.id.view_flipper);

        for(int i=0;i<imgarry.length;i++)
            showimage(imgarry[i]);
        }
        public void showimage(int img){
        ImageView image = new ImageView(this);
        image.setBackgroundResource(img);

        filpper.addView(image);
        filpper.setFlipInterval(3000);
        filpper.setAutoStart(true);

        filpper.setInAnimation(this, android.R.anim.slide_in_left);
        filpper.setInAnimation(this, android.R.anim.slide_out_right);
        }
    }
