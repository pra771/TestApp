package com.example.dogsafityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    private EditText userName;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        userName = findViewById(R.id.et_username);
        password = findViewById(R.id.ed_password);


        login = findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userName.getText().toString().equals("pra1903@gmail.com") &&
                        password.getText().toString().equals("pra123")) {
                    Toast.makeText(LoginScreen.this, "Login Successfully", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginScreen.this, SideNavigation.class);
                    startActivity(intent);
                } else
                    Toast.makeText(LoginScreen.this, "Wrong Credentails", Toast.LENGTH_SHORT).show();
            }


        });

        }
    }