package com.example.getcall;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UserServices {



    @GET("/api/users?page=2")
    Call<UserResponse> getUser();
}