package com.example.getcall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ModelUserViewHolder> {

    private List<ModelUser> modelUserList;
    private Context context;

    public UserAdapter(List<ModelUser> modelUserList) {
        this.modelUserList = modelUserList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserAdapter.ModelUserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_userdeatils,parent,false);
        return new ModelUserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ModelUserViewHolder holder, int position) {
        holder.id.setText(Integer.toString(modelUserList.get(position).id));
        holder.email.setText(modelUserList.get(position).email);
        holder.name.setText(modelUserList.get(position).first_name);
    }

    @Override
    public int getItemCount() {
        return modelUserList.size();
    }
public class ModelUserViewHolder extends RecyclerView.ViewHolder{

        private TextView id;
        private TextView email;
        private TextView name;


    public ModelUserViewHolder(@NonNull View itemView) {
        super(itemView);

        id = itemView.findViewById(R.id.tv_id);
        email = itemView.findViewById(R.id.tv_email);
        name = itemView.findViewById(R.id.tv_name);
    }
}
}
