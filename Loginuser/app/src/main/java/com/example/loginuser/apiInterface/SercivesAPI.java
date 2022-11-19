package com.example.loginuser.apiInterface;

import com.example.loginuser.Models.LoginuserDetiles;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SercivesAPI {

    @FormUrlEncoded
    @POST("/api/users?page")
    Call<LoginuserDetiles> register(
            @Field("usename") String username,
            @Field("EmailAdress") String EmailAdress,
            @Field("Password") String Password,
            @Field("Repassword") String Repassword
    );
}