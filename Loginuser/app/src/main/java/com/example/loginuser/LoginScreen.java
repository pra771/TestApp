package com.example.loginuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class LoginScreen extends AppCompatActivity {
    Button buttonnext;
    TextView accountregister;
    EditText inputemail,inputpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        buttonnext = findViewById(R.id.btn_login);
        accountregister = findViewById(R.id.tv_registeraccount);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 validateData();
            }
        });
        accountregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this,SelectedScreen.class);
                startActivity(intent);
            }
        });
    }

    private void validateData() {
        String email =  inputemail.getText().toString().trim();
        String password = inputpassword.getText().toString().trim();
        if(email.isEmpty()){
            inputemail.setError("Enter Email");
            inputemail.requestFocus();
            return;
        }
        if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            inputemail.setError("Enter Valid Email");
            inputemail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            inputpassword.setError("Enter password");
            inputpassword.requestFocus();
            return;
        }
        if(password.length()<8){
            inputpassword.setError("password too short");
            inputpassword.requestFocus();
            return;
        }
        if(password.length()>30){
            inputpassword.setError("password to long");
            inputpassword.requestFocus();
            return;
        }
        else{
            doLogin(email,password);
        }
    }
    private void doLogin(String email,String password){

    }
}