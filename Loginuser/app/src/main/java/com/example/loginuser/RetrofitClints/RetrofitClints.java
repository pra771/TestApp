package com.example.loginuser.RetrofitClints;

import com.example.loginuser.apiInterface.SercivesAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClints {
    private static RetrofitClints mInstance;
    private Retrofit retrofit;

    private  RetrofitClints(){
         retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://reqres.in/")
                .build();

    }

    public static synchronized RetrofitClints getInstance(){
        if(mInstance == null){
            mInstance = new RetrofitClints();
        }
        return mInstance;
    }

    public SercivesAPI getSercivesAPI(){
        return retrofit.create(SercivesAPI.class);
    }
}
