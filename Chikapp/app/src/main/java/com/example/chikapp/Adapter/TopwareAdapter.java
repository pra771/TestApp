package com.example.chikapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chikapp.Model.ModelTopware;
import com.example.chikapp.R;
import com.example.chikapp.SingleProductCosmotics;
import com.example.chikapp.SingleProductWomen;

import java.util.List;

public class TopwareAdapter extends RecyclerView.Adapter<TopwareAdapter.ModelTopwareViewHolder> {

    private List<ModelTopware> modelTopwarelist;

    private Context context;

    public TopwareAdapter(List<ModelTopware> modelTopwarelist,Context context) {
        this.modelTopwarelist = modelTopwarelist;
        this.context = context;
    }

    @NonNull
    @Override
    public TopwareAdapter.ModelTopwareViewHolder onCreateViewHolder(@Nullable ViewGroup parent,int viewType){
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topware,parent,false);
    return new ModelTopwareViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelTopwareViewHolder holder, int position) {

        holder.amount.setText( modelTopwarelist.get(position).getAmount());
        holder.amount1.setText(modelTopwarelist.get(position).getAmount1());
        holder.image.setImageResource(modelTopwarelist.get(position).getImagetopware());
        holder.image1.setImageResource(modelTopwarelist.get(position).getImage1());
        holder.itemClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SingleProductWomen.class);
                context.startActivity(intent);
            }
        });
        holder.itemClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,SingleProductWomen.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
    return modelTopwarelist.size();
    }
    public class ModelTopwareViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView amount;
        private ConstraintLayout itemClick;
        private TextView amount1;
        private ImageView image1;
        private ConstraintLayout itemClick1;

        public ModelTopwareViewHolder(@NonNull View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.img_girl);
            amount = itemView.findViewById(R.id.tv_amount);
            itemClick = itemView.findViewById(R.id.con_layout);
            image1 = itemView.findViewById(R.id.img_girl1);
            amount1 = itemView.findViewById(R.id.tv_amount1);
            itemClick1 = itemView.findViewById(R.id.con_layout1);

        }
    }
}
