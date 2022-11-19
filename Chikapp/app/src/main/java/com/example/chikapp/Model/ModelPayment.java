package com.example.chikapp.Model;

import android.widget.TextView;

public class ModelPayment {
    private int image;
    private String large;
    private String amount;

    public ModelPayment(int image, String large, String amount) {
        this.image = image;
        this.large = large;
        this.amount = amount;
    }

    public int getImage() {
        return image;
    }

    public String getLarge() {
        return large;
    }

    public String getAmount() {
        return amount;
    }
}
