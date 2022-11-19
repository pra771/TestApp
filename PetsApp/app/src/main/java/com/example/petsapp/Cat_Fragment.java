package com.example.petsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.petsapp.Model.Adapter.CatsAdapter;
import com.example.petsapp.Model.ModelCats;

import java.util.ArrayList;
import java.util.List;

public class Cat_Fragment extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private List<ModelCats> modelCats;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cat_, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_cats);

        CatsAdapter catAdapter = new CatsAdapter(modelCats, getContext());
        recyclerView.setAdapter(catAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        return view;
    }

    public void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        modelCats = new ArrayList<>();
        modelCats.add(new ModelCats(R.mipmap.catimage,R.mipmap.catimage1,"Maddy","Mad max","Gender:male","Gender:male"));
        modelCats.add(new ModelCats(R.mipmap.catimage2,R.mipmap.catimage3,"scanner","canddy","Gender:female","Gender:male"));
        modelCats.add(new ModelCats(R.mipmap.catimage4,R.mipmap.catimage,"Maker","sandy","Gender:male","Gender:male"));
        modelCats.add(new ModelCats(R.mipmap.catimage1,R.mipmap.catimage2,"bunny","dober","Gender:male","Gender:female"));
        modelCats.add(new ModelCats(R.mipmap.catimage3,R.mipmap.catimage4,"canddy","switty","Gender:male","Gender:male"));
        modelCats.add(new ModelCats(R.mipmap.catimage,R.mipmap.catimage,"Maddy","Mad max","Gender:female","Gender:female"));
        modelCats.add(new ModelCats(R.mipmap.catimage2,R.mipmap.catimage3,"Scanner","sandy","Gender:male","Gender:male"));
        modelCats.add(new ModelCats(R.mipmap.catimage4,R.mipmap.catimage,"Maker","canddy","Gender:male","Gender:male"));
        modelCats.add(new ModelCats(R.mipmap.catimage1,R.mipmap.catimage,"dober","Mad max","Gender:male","Gender:female"));
        modelCats.add(new ModelCats(R.mipmap.catimage2,R.mipmap.catimage3,"Maddy","Scanner","Gender:female","Gender:male"));

    }
}