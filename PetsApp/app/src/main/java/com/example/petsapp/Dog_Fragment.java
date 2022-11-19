package com.example.petsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.petsapp.Model.Adapter.DogAdapter;
import com.example.petsapp.Model.ModelDog;

import java.util.ArrayList;
import java.util.List;

public class Dog_Fragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private List<ModelDog> modelDog;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dog_,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_dog);
        DogAdapter dogAdapter = new DogAdapter(modelDog,getContext());
        recyclerView.setAdapter(dogAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        return view;
    }
    public void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        modelDog = new ArrayList<>();
        modelDog.add(new ModelDog(R.mipmap.dogimage,R.mipmap.dogimage1,"Maddy","Mad max","Gender:male","Gender:male"));
        modelDog.add(new ModelDog(R.mipmap.dogimage2,R.mipmap.dogimage3,"scanner","canddy","Gender:female","Gender:male"));
        modelDog.add(new ModelDog(R.mipmap.dogimage4,R.mipmap.dogimage,"Maker","sandy","Gender:male","Gender:male"));
        modelDog.add(new ModelDog(R.mipmap.dogimage1,R.mipmap.dogimage2,"bunny","dober","Gender:male","Gender:female"));
        modelDog.add(new ModelDog(R.mipmap.dogimage3,R.mipmap.dogimage4,"canddy","switty","Gender:male","Gender:male"));
        modelDog.add(new ModelDog(R.mipmap.dogimage,R.mipmap.dogimage,"Maddy","Mad max","Gender:female","Gender:female"));
        modelDog.add(new ModelDog(R.mipmap.dogimage2,R.mipmap.dogimage3,"Scanner","sandy","Gender:male","Gender:male"));
        modelDog.add(new ModelDog(R.mipmap.dogimage4,R.mipmap.dogimage,"Maker","canddy","Gender:male","Gender:male"));
        modelDog.add(new ModelDog(R.mipmap.dogimage1,R.mipmap.dogimage,"dober","Mad max","Gender:male","Gender:female"));
        modelDog.add(new ModelDog(R.mipmap.dogimage2,R.mipmap.dogimage3,"Maddy","Scanner","Gender:female","Gender:male"));

    }
}