package com.example.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterScreen extends AppCompatActivity {
    EditText username;
    EditText emailaddress;
    EditText password;
    EditText repassword;
    Button butnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        username = findViewById(R.id.et_username);
        emailaddress = findViewById(R.id.et_emailadress);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.et_repassword);
        butnlogin = findViewById(R.id.signup1);

        butnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(emailaddress.getText().toString() )|| TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString()) || TextUtils.isEmpty(repassword.getText().toString())){

                    String message = "All inputs required ..";
                    Toast.makeText(RegisterScreen.this,message,Toast.LENGTH_LONG).show();
                }else {
                    RegisterRequest registerRequest = new RegisterRequest();
                    registerRequest.setEmailaddress(emailaddress.getText().toString());
                    registerRequest.setPassword(password.getText().toString());
                  //  registerRequest.setUsername(username.getText().toString());
                  //  registerRequest.setUsername(repassword.getText().toString());
                    registerUser(registerRequest);
                }
            }
        });
    }

    public void registerUser(RegisterRequest registerRequest){
        Call<UserResponse> registerResponseCall1 = RetrofitClient.getServices().getUser();
        Log.e("Error","Respuest Sent");
        registerResponseCall1.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {

                if(response.isSuccessful()){

                    Intent intent = new Intent(RegisterScreen.this,LoginScreen.class);
                    startActivity(intent);
                    finish();
                    UserResponse ur=response.body();
                    String message = "Successful ..";
                    message =response.toString();
                    Log.e("Error",message);
                    Toast.makeText(RegisterScreen.this,message,Toast.LENGTH_LONG).show();



                }else{
                    String message = "An error occurred please try again later...";
                    message =response.toString();
                    Log.e("Error",message);
                    Toast.makeText(RegisterScreen.this,message,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {

                String message = t.getLocalizedMessage();
                Toast.makeText(RegisterScreen.this,message,Toast.LENGTH_LONG).show();

            }
        });

/*
        Call<RegisterResponse> registerResponseCall = RetrofitClient.getServices().registerUser(registerRequest);
        Log.e("Error","Respuest Sent");
        registerResponseCall.enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {

                if(response.isSuccessful()){

                    Intent intent = new Intent(RegisterScreen.this,LoginScreen.class);
                    startActivity(intent);
                    finish();

                    String message = "Successful ..";
                    Toast.makeText(RegisterScreen.this,message,Toast.LENGTH_LONG).show();



                }else{
                    String message = "An error occurred please try again later...";
                    message =response.toString();
                    Log.e("Error",message);
                    Toast.makeText(RegisterScreen.this,message,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {

                String message = t.getLocalizedMessage();
                Toast.makeText(RegisterScreen.this,message,Toast.LENGTH_LONG).show();

            }
        });
        */

    }
}