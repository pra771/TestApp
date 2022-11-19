package com.example.chikapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText username;
    EditText password;
    TextView forgotpassword;
    Button login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        forgotpassword = findViewById(R.id.tv_forgotpassword);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("pra1903@gmail.com")
                        && password.getText().toString().equals("pra123")) {
                    Toast.makeText(LoginPage.this, "LoginSuccessfull", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginPage.this, SideNavigation.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginPage.this, "loginfail", Toast.LENGTH_SHORT).show();
                }
            }
        });
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginPage.this,ForgotPasswordPage.class);
                startActivity(intent);
            }
        });
    }
}