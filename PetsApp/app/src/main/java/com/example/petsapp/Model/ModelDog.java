package com.example.petsapp.Model;

public class ModelDog {
    private int image;
    private int image1;
    private String textname;
    private String textname1;
    private String textgender;
    private String textgender1;

    public ModelDog(int image,int image1, String textname, String textname1,String textgender,String textgender1) {
        this.image = image;
        this.image1 = image1;
        this.textname = textname;
        this.textname1 = textname1;
        this.textgender = textgender;
        this.textgender1 = textgender1;
    }

    public int getImage() {
        return image;
    }

    public int getImage1() {
        return image1;
    }

    public String getTextname() {
        return textname;
    }

    public String getTextname1() {
        return textname1;
    }

    public String getTextgender() {
        return textgender;
    }

    public String getTextgender1() {
        return textgender1;
    }
}
