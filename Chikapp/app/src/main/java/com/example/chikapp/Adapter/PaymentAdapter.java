package com.example.chikapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chikapp.Model.ModelPayment;
import com.example.chikapp.R;

import java.util.List;

    public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.ModelPaymentViewHolder> {

    private List<ModelPayment>modelPaymentList;

    private Context context;

        public PaymentAdapter(List<ModelPayment> modelPaymentList) {
            this.modelPaymentList = modelPaymentList;
            this.context = context;
        }

        @NonNull
        @Override
        public PaymentAdapter.ModelPaymentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_payment,parent,false);

            return new ModelPaymentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentAdapter.ModelPaymentViewHolder holder, int position) {
        holder.image.setImageResource(modelPaymentList.get(position).getImage());
        holder.amount.setText(modelPaymentList.get(position).getAmount());
        holder.large.setText(modelPaymentList.get(position).getLarge());

    }

    @Override
    public int getItemCount() {
        return modelPaymentList.size();
    }
    public class ModelPaymentViewHolder extends RecyclerView.ViewHolder{

            private ImageView image;
            private TextView large;
            private TextView amount;
        public ModelPaymentViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.img_payment);
            large = itemView.findViewById(R.id.tv_size);
            amount = itemView.findViewById(R.id.tv_amount);
        }
    }
}
