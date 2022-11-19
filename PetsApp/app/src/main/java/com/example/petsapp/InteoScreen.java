package com.example.petsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.petsapp.Model.Adapter.SliderAdapter;
import com.example.petsapp.Model.Model;

import java.util.ArrayList;
import java.util.List;

public class InteoScreen extends AppCompatActivity {
    ConstraintLayout constraintLayout;

    ViewPager screenpage;
    SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inteo_screen);

        List<Model> list = new ArrayList<>();
        list.add(new Model("Adope One","Dogs just need you and love that's all",R.mipmap.dog1));
        list.add(new Model("Adope_two","If I could be half the persion my dog is,I'D be twice the human I Am",R.mipmap.dog2));
        list.add(new Model("Adope_three","It is not what we have in life but you have in life our lives that metters",R.mipmap.dog3));

        screenpage = findViewById(R.id.view_page);
        sliderAdapter = new SliderAdapter(this,list);
        screenpage.setAdapter(sliderAdapter);

        constraintLayout = findViewById(R.id.constraintLayout);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InteoScreen.this,LoginScreen.class);
                startActivity(intent);
            }
        });
    }
}