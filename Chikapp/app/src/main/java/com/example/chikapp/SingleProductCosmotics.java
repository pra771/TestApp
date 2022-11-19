package com.example.chikapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SingleProductCosmotics extends AppCompatActivity {
    ImageView arrow;
    Button add;
    Button paymentmethod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_product_cosmotics);

        arrow = findViewById(R.id.imageView);
        add = findViewById(R.id.btn_addcart);
        paymentmethod = findViewById(R.id.btn_buynowcosmotics);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleProductCosmotics.this,BeautyProductsFragment.class);
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleProductCosmotics.this,CartPage.class);
                startActivity(intent);
            }
        });
        paymentmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleProductCosmotics.this,PaymentPage.class);
                startActivity(intent);
            }
        });

    }
}