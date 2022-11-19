package com.example.chikapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.chikapp.Adapter.CartAdapter;
import com.example.chikapp.Model.ModelCart;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends AppCompatActivity {

    private ImageView imageView;
    private RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    private List<ModelCart> modelCartList;
    CartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_page);

        mId();
        mData();
        mRecyclerview();

    }
    public void mId(){
        imageView = findViewById(R.id.img_narrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CartPage.this,CheckOutPage.class);
                startActivity(intent);
            }
        });

    }


    public void mData() {
        modelCartList = new ArrayList<>();
        modelCartList.add(new ModelCart(R.mipmap.cream, "Size: XL", "$2000"));
        modelCartList.add(new ModelCart(R.mipmap.girl5, "Size: L", "$1000"));
        modelCartList.add(new ModelCart(R.mipmap.breash, "Size: S", "$1000"));
        modelCartList.add(new ModelCart(R.mipmap.perfume, "Size: M", "$1000"));
        modelCartList.add(new ModelCart(R.mipmap.girl, "Size: XL", "$1000"));
        modelCartList.add(new ModelCart(R.mipmap.girl1, "Size: L", "$1000"));
        modelCartList.add(new ModelCart(R.mipmap.polish, "Size: M", "$1000"));
        modelCartList.add(new ModelCart(R.mipmap.girl2, "Size: L", "$1000"));
    }
    public void mRecyclerview(){
        recyclerView = findViewById(R.id.recycler_cart);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new CartAdapter(modelCartList);
        recyclerView.setAdapter((RecyclerView.Adapter) adapter);


    }
}