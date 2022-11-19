package com.example.chikapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SingleProductWomen extends AppCompatActivity {

    ImageView arrow;
    Button addcard;
    Button payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_product_women);
        arrow = findViewById(R.id.imageView);

        addcard = findViewById(R.id.btn_add);
        payment = findViewById(R.id.btn_buynow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleProductWomen.this,TopWareFragment.class);
                startActivity(intent);
            }
        });

        addcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleProductWomen.this,CartPage.class);
                startActivity(intent);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleProductWomen.this,PaymentPage.class);
                startActivity(intent);
            }
        });
    }
}