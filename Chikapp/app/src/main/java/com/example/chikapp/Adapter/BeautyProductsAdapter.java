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

import com.example.chikapp.Model.ModelBeautyProducts;
import com.example.chikapp.Model.ModelTopware;
import com.example.chikapp.R;
import com.example.chikapp.SingleProductCosmotics;

import java.util.List;

public class BeautyProductsAdapter  extends RecyclerView.Adapter<BeautyProductsAdapter.ModelBeautyProductsViewHolder> {

    private List<ModelBeautyProducts> modelBeautyProductsList;

    private Context context;

    public BeautyProductsAdapter(List<ModelBeautyProducts> modelBeautyProductsList,Context context) {
        this.modelBeautyProductsList = modelBeautyProductsList;
        this.context = context;
    }

    @NonNull
    @Override
    public BeautyProductsAdapter.ModelBeautyProductsViewHolder onCreateViewHolder(@Nullable ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_beauty,parent,false);
        return new BeautyProductsAdapter.ModelBeautyProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeautyProductsAdapter.ModelBeautyProductsViewHolder holder, int position) {
        holder.image.setImageResource(modelBeautyProductsList.get(position).getImage());
        holder.amount.setText( modelBeautyProductsList.get(position).getAmount());
        holder.amount1.setText(modelBeautyProductsList.get(position).getAmount1());
        holder.image1.setImageResource(modelBeautyProductsList.get(position).getImage1());
        holder.itemClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SingleProductCosmotics.class);
                context.startActivity(intent);
            }
        });
        holder.itemClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,SingleProductCosmotics.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return modelBeautyProductsList.size();
    }
    public class ModelBeautyProductsViewHolder extends RecyclerView.ViewHolder{
        private TextView amount;
        private ImageView image;
        private ConstraintLayout itemClick;
        private TextView amount1;
        private ImageView image1;
        private ConstraintLayout itemClick1;

        public ModelBeautyProductsViewHolder(@NonNull View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.img_bresh);
            amount = itemView.findViewById(R.id.tv_amountbeauty);
            itemClick = itemView.findViewById(R.id.con_layoutbeauty);
            image1 = itemView.findViewById(R.id.img_lipstick);
            amount1 = itemView.findViewById(R.id.tv_amountbeauty1);
            itemClick1 = itemView.findViewById(R.id.con_layoutbuaty1);

        }
    }
}
