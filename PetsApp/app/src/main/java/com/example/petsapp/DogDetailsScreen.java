package com.example.petsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class DogDetailsScreen extends AppCompatActivity {

    Button buttonadopeme;

    ImageView imageView;

    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_details_screen);
        buttonadopeme = findViewById(R.id.btn_adoptme);
        buttonadopeme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DogDetailsScreen.this,AdopeScreen.class);
                startActivity(intent);
            }
        });

        int imgarry[] = {
                R.mipmap.dogslideview,R.mipmap.dogslideview1,R.mipmap.dogslideview2
        };
        flipper = findViewById(R.id.view_flipper1);
        for(int i=0;i<imgarry.length;i++)
            showimage(imgarry[i]);
    }

    public void showimage(int img){
        ImageView image = new ImageView(this);
        image.setBackgroundResource(img);

        flipper.addView(image);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setInAnimation(this, android.R.anim.slide_out_right);
    }

}