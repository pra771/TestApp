package com.example.chikapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chikapp.Model.ModelCart;
import com.example.chikapp.R;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ModelCartViewHolder> {

private List<ModelCart> modelCartList;

private Context context;

    public CartAdapter(List<ModelCart> modelCartList) {
        this.modelCartList = modelCartList;
        this.context = context;
    }

    @NonNull
    @Override
    public CartAdapter.ModelCartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart,parent,false);
        return new ModelCartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ModelCartViewHolder holder, int position) {

        holder.image.setImageResource(modelCartList.get(position).getImageview());
        holder.size.setText(modelCartList.get(position).getSize());
        holder.amount.setText(modelCartList.get(position).getAmount());

    }

    @Override
    public int getItemCount() {
        return modelCartList.size();
    }

    public class ModelCartViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView size;
        private TextView amount;

        public ModelCartViewHolder(@NonNull View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.img_cream);
            size = itemView.findViewById(R.id.tv_size);
            amount = itemView.findViewById(R.id.tv_amount1);
        }
    }
}
