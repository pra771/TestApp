package com.example.dogsafityapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class SliderAdapter extends PagerAdapter {
    Context context;
   List<Model> modelList;

    public SliderAdapter(Context context,List<Model> modelList){
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup container,int position){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.slide_layout,null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.img_adopone);
        TextView title = layoutScreen.findViewById(R.id.tv_adopeone);
        TextView description = layoutScreen.findViewById(R.id.tv_text1);

        title.setText(modelList.get(position).getTitle());
        description.setText(modelList.get(position).getDescription());
        imgSlide.setImageResource(modelList.get(position).getScreenImg());
        container.addView(layoutScreen);
        return layoutScreen;
    }

    public int getCount() {
        return modelList.size();
    }


    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }
    public void destroyItem(ViewGroup container,int position,@NonNull  Object object){
        container.removeView((View)object);

    }
}
