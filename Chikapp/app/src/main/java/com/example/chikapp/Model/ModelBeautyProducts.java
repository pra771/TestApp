package com.example.chikapp.Model;

import android.widget.TextView;

public class ModelBeautyProducts {

    private int image;
    private int image1;
    private String amount;
    private String amount1;

    public ModelBeautyProducts(int image, int image1, String amount, String amount1) {
        this.image = image;
        this.image1 = image1;
        this.amount = amount;
        this.amount1 = amount1;
    }

    public int getImage() {
        return image;
    }

    public int getImage1() {
        return image1;
    }
    public String getAmount() {
        return amount;
    }
    public String getAmount1() {
        return amount1;
    }
}
