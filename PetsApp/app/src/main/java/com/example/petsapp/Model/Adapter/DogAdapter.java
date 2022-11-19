package com.example.petsapp.Model.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petsapp.DogDetailsScreen;
import com.example.petsapp.Model.ModelDog;
import com.example.petsapp.R;


import java.util.List;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.ModelDogViewHolder> {

    private List<ModelDog> modelDogList;

    private Context context;

    public DogAdapter(List<ModelDog> modelDogList, Context context) {
        this.modelDogList = modelDogList;
        this.context = context;

    }

    @NonNull
    @Override
    public DogAdapter.ModelDogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dog,parent,false);
        return new ModelDogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DogAdapter.ModelDogViewHolder holder, int position) {
        holder.textname.setText(modelDogList.get(position).getTextname());
        holder.textgender.setText(modelDogList.get(position).getTextgender());
        holder.imagedog.setImageResource(modelDogList.get(position).getImage());
        holder.textname1.setText(modelDogList.get(position).getTextname1());
        holder.textgender1.setText(modelDogList.get(position).getTextgender1());
        holder.imagedog1.setImageResource(modelDogList.get(position).getImage1());

        holder.itemClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DogDetailsScreen.class);
                context.startActivity(intent);
            }
        });

        holder.imagedog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DogDetailsScreen.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelDogList.size();
    }
    public class ModelDogViewHolder extends RecyclerView.ViewHolder{
        private TextView textname;
        private TextView textgender;
        private ImageView imagedog;
        private TextView textname1;
        private TextView textgender1;
        private ImageView imagedog1;
        private ConstraintLayout itemClick;



        public ModelDogViewHolder (@NonNull View itemView){
            super(itemView);
            textname = itemView.findViewById(R.id.tv_dogname);
            textgender = itemView.findViewById(R.id.tv_gender);
            imagedog = itemView.findViewById(R.id.img_dogimage);
            itemClick = itemView.findViewById(R.id.constraintLayout2);


            textname1 = itemView.findViewById(R.id.tv_dogname1);
            textgender1 = itemView.findViewById(R.id.tv_genderr);
            imagedog1 = itemView.findViewById(R.id.dogimage1);

        }
    }
}
