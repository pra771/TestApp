package com.example.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginScreen extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;
    TextView account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        username = findViewById(R.id.userid_et);
        password = findViewById(R.id.et_password);
        login = findViewById(R.id.btn_login);
        account = findViewById(R.id.tv_registeraccount);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this,RegisterScreen.class);
                startActivity(intent);
            }
        });

        login = findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    String message = "All inputs required";
                    Toast.makeText(LoginScreen.this,message,Toast.LENGTH_LONG).show();
                }else{
                    LoginRequest loginRequest = new LoginRequest();
                    loginRequest.setUsername(username.getText().toString());
                    loginRequest.setPassword(password.getText().toString());
                }

            }
        });
    }

    public void loginUser(LoginRequest loginRequest){
        Call<LoginResponse> loginResponseCall = RetrofitClient.getServices().loginUser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful()){
                    LoginResponse loginResponse = response.body();
                    startActivity(new Intent(LoginScreen.this,MainActivity.class).putExtra("data",loginResponse));
                    finish();
                }else{
                    String message ="An error occurred please try again later... ";
                    Toast.makeText(LoginScreen.this,message,Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });

    }
}