package com.example.petsapp.Model.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petsapp.Cat_Adope_Screen;
import com.example.petsapp.Cat_details_screen;
import com.example.petsapp.Model.ModelCats;
import com.example.petsapp.R;

import java.util.List;
public class CatsAdapter extends RecyclerView.Adapter<CatsAdapter.ModelCatsViewHolder>{

    private List<ModelCats> modelCatsList;

    private Context context;


    public CatsAdapter(List<ModelCats> modelCatsList, Context context) {
        this.modelCatsList = modelCatsList;
        this.context = context;
    }
    @NonNull
    @Override
    public ModelCatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false);
        return new ModelCatsViewHolder(view);
    }

        @Override
        public void onBindViewHolder(@NonNull CatsAdapter.ModelCatsViewHolder holder,int position){
            holder.textnamecats.setText(modelCatsList.get(position).getTextnamecats());
            holder.textgendercats.setText(modelCatsList.get(position).getTextgendercats());
            holder.imagecats.setImageResource(modelCatsList.get(position).getImagecats());
            holder.textnamecats1.setText(modelCatsList.get(position).getTextnamecats1());
            holder.textgendercats1.setText(modelCatsList.get(position).getTextgendercats1());
            holder.imagecats1.setImageResource(modelCatsList.get(position).getImagecats1());

            holder.imagecats.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Cat_details_screen.class);
                    context.startActivity(intent);
                }
            });
        }

    @Override
    public int getItemCount() {
        return modelCatsList.size();
    }

    public class ModelCatsViewHolder extends RecyclerView.ViewHolder {
        private TextView textnamecats;
        private TextView textgendercats;
        private ImageView imagecats;
        private TextView textnamecats1;
        private TextView textgendercats1;
        private ImageView imagecats1;

        public ModelCatsViewHolder(@NonNull View itemView) {
            super(itemView);
            textnamecats = itemView.findViewById(R.id.tv_catname);
            textgendercats = itemView.findViewById(R.id.tv_gendercats);
            imagecats = itemView.findViewById(R.id.img_catimage);

            textnamecats1 = itemView.findViewById(R.id.tv_catsname1);
            textgendercats1 = itemView.findViewById(R.id.tv_genderrcats);
            imagecats1 = itemView.findViewById(R.id.catimage1);

        }
    }

}
