package com.example.petsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    private TextView registeraccount;
    private TextView signup;
    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_screen);

        username = findViewById(R.id.et_inputusername);
        password = findViewById(R.id.et_inputpassword);
        registeraccount = findViewById(R.id.tv_register);
        signup = findViewById(R.id.tv_SignUp);
        login = findViewById(R.id.btn_login);

        final ProgressbarDialog progressbarDialog = new ProgressbarDialog(LoginScreen.this);

        registeraccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this,RegisterScreen.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this,RegisterScreen.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("pra1903@gmail.com")
                                                 && password.getText().toString().equals("pra123")){
                    Toast.makeText(LoginScreen.this,"LoginSuccessfull",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginScreen.this, SideNavigation.class);
                    startActivity(intent);
                }else
                    Toast.makeText(LoginScreen.this,"LoginFail",Toast.LENGTH_SHORT).show();

                progressbarDialog.startLoadingDialog();
                Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressbarDialog.dismissDialog();
                    }
                },5000);
            }
        });

    }
}