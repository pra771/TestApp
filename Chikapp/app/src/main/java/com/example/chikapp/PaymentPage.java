package com.example.chikapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chikapp.Adapter.PaymentAdapter;
import com.example.chikapp.Model.ModelPayment;

import java.util.ArrayList;
import java.util.List;

public class PaymentPage extends AppCompatActivity {

    private TextView textview;
    private ImageView imageView;
    private ImageView imageView1;
    private RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    private List<ModelPayment> modelPaymentlist;
    PaymentAdapter paymentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_page);

       mId();
        mData();
        mRecyclerview();
    }
    public void mId(){
        imageView = findViewById(R.id.img_narrow);
        textview = findViewById(R.id.tv_edit);
        imageView1 = findViewById(R.id.img_leftarrowpayment);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentPage.this,CartPage.class);
                startActivity(intent);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentPage.this,AddressPage.class);
                startActivity(intent);
            }
        });
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentPage.this,OrderSuccessPage.class);
                startActivity(intent);
            }
        });
    }

    public void mData(){
        modelPaymentlist = new ArrayList<>();
        modelPaymentlist.add(new ModelPayment(R.mipmap.girl5,"L","$1500"));
        modelPaymentlist.add(new ModelPayment(R.mipmap.breash,"XL","$1000"));
        modelPaymentlist.add(new ModelPayment(R.mipmap.perfume,"M","$1500"));
        modelPaymentlist.add(new ModelPayment(R.mipmap.girl,"S","$1700"));
        modelPaymentlist.add(new ModelPayment(R.mipmap.girl1,"XL","$1500"));
        modelPaymentlist.add(new ModelPayment(R.mipmap.cream,"L","$1000"));
        modelPaymentlist.add(new ModelPayment(R.mipmap.girl4,"XS","$1500"));
        modelPaymentlist.add(new ModelPayment(R.mipmap.girl2,"M","$1000"));
        modelPaymentlist.add(new ModelPayment(R.mipmap.pait,"M","$1500"));

    }
    public void mRecyclerview(){
        recyclerView = findViewById(R.id.rc_viewpayment);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        paymentAdapter =new PaymentAdapter(modelPaymentlist);
        recyclerView.setAdapter((RecyclerView.Adapter) paymentAdapter);
    }
}