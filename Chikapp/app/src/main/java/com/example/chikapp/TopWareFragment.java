package com.example.chikapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chikapp.Adapter.TopwareAdapter;
import com.example.chikapp.Model.ModelTopware;

import java.util.ArrayList;
import java.util.List;


public class TopWareFragment extends Fragment {

    View view;

    private RecyclerView recyclerView;
    private List<ModelTopware> modelTopwares;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_topware, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_topware);
        TopwareAdapter topwareAdapter = new TopwareAdapter(modelTopwares,getContext());
        recyclerView.setAdapter(topwareAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        return view;
    }
    public void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //get call

        modelTopwares = new ArrayList<>();


        modelTopwares.add(new ModelTopware(R.mipmap.girl,R.mipmap.girl1,"$500","$600"));
        modelTopwares.add(new ModelTopware(R.mipmap.girl2,R.mipmap.girl3,"$500","$600"));
        modelTopwares.add(new ModelTopware(R.mipmap.girl4,R.mipmap.girl,"$500","$600"));
        modelTopwares.add(new ModelTopware(R.mipmap.girl1,R.mipmap.girl2,"$500","$600"));
        modelTopwares.add(new ModelTopware(R.mipmap.girl3,R.mipmap.girl4,"$500","$600"));
        modelTopwares.add(new ModelTopware(R.mipmap.girl,R.mipmap.girl2,"$500","$600"));
        modelTopwares.add(new ModelTopware(R.mipmap.girl3,R.mipmap.girl1,"$500","$600"));
        modelTopwares.add(new ModelTopware(R.mipmap.girl4,R.mipmap.girl,"$500","$600"));

    }
}