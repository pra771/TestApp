package com.example.loginandregister;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UserServices {

    @POST("/api/login")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

    @Headers("Content-Type: application/json")
    @POST("/api/register")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);

    @GET("/api/users?page=2")
    Call<UserResponse> getUser();
}
