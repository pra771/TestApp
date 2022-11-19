package com.example.chikapp.Model;

public class ModelCart {
    private int imageview;
    private String size;
    private String amount;

    public ModelCart(int imageview, String size, String amount) {
        this.imageview = imageview;
        this.size = size;
        this.amount = amount;
    }

    public int getImageview() {
        return imageview;
    }

    public String getSize() {
        return size;
    }

    public String getAmount() {
        return amount;
    }
}
