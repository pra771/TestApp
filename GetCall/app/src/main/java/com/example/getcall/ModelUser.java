package com.example.getcall;

public class ModelUser {
    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;

    public ModelUser(int id, String email, String first_name,String last_name,String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }


}
