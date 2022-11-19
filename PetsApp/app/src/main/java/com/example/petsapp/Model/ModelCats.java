package com.example.petsapp.Model;

public class ModelCats {
    private int imagecats;
    private int imagecats1;
    private String textnamecats;
    private String textnamecats1;
    private String textgendercats;
    private String textgendercats1;

    public ModelCats(int imagecats, int imagecats1, String textnamecats, String textnamecats1, String textgendercats, String textgendercats1) {
        this.imagecats = imagecats;
        this.imagecats1 = imagecats1;
        this.textnamecats = textnamecats;
        this.textnamecats1 = textnamecats1;
        this.textgendercats = textgendercats;
        this.textgendercats1 = textgendercats1;
    }

    public int getImagecats() {
        return imagecats;
    }

    public int getImagecats1() {
        return imagecats1;
    }

    public String getTextnamecats() {
        return textnamecats;
    }

    public String getTextnamecats1() {
        return textnamecats1;
    }

    public String getTextgendercats() {
        return textgendercats;
    }

    public String getTextgendercats1() {
        return textgendercats1;
    }
}
