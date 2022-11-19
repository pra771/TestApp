package com.example.chikapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chikapp.Adapter.BeautyProductsAdapter;
import com.example.chikapp.Adapter.TopwareAdapter;
import com.example.chikapp.Model.ModelBeautyProducts;
import com.example.chikapp.Model.ModelTopware;

import java.util.ArrayList;
import java.util.List;


public class BeautyProductsFragment extends Fragment {

    View view;

    private RecyclerView recyclerView;
    private List<ModelBeautyProducts> modelBeautyProducts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_beauty_products, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_beautyproducts);
        BeautyProductsAdapter beautyProductsAdapter = new BeautyProductsAdapter(modelBeautyProducts,getContext());
        recyclerView.setAdapter(beautyProductsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        return view;
    }
    public void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        modelBeautyProducts = new ArrayList<>();

        modelBeautyProducts.add(new ModelBeautyProducts(R.mipmap.breash,R.mipmap.lipstick,"$300","$400"));
        modelBeautyProducts.add(new ModelBeautyProducts(R.mipmap.polish,R.mipmap.perfume,"$300","$400"));
        modelBeautyProducts.add(new ModelBeautyProducts(R.mipmap.pait,R.mipmap.cream,"$300","$400"));
        modelBeautyProducts.add(new ModelBeautyProducts(R.mipmap.breash,R.mipmap.lipstick,"$300","$400"));
        modelBeautyProducts.add(new ModelBeautyProducts(R.mipmap.perfume,R.mipmap.polish,"$300","$400"));
        modelBeautyProducts.add(new ModelBeautyProducts(R.mipmap.cream,R.mipmap.pait,"$300","$400"));
        modelBeautyProducts.add(new ModelBeautyProducts(R.mipmap.breash,R.mipmap.lipstick,"$300","$400"));
        modelBeautyProducts.add(new ModelBeautyProducts(R.mipmap.polish,R.mipmap.perfume,"$300","$400"));



    }
}