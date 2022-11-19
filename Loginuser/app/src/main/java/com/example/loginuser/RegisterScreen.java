package com.example.loginuser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginuser.Models.LoginuserDetiles;
import com.example.loginuser.RetrofitClints.RetrofitClints;
import com.example.loginuser.apiInterface.SercivesAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterScreen extends AppCompatActivity {
    Button login;
    EditText usename,emailaddress,password,repassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        usename = findViewById(R.id.et_username);
        emailaddress = findViewById(R.id.et_emailadress);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.et_repassword);

       login = findViewById(R.id.signup1);
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               validateData();
           }
       });
    }

    private void validateData() {

        String Username = usename.getText().toString().trim();
        String EmailAddress = emailaddress.getText().toString().trim();
        String Password = password.getText().toString().trim();
        String RePassword = repassword.getText().toString().trim();
        if(Username.isEmpty()){
            usename.setError("Enter username");
            usename.requestFocus();
            return;
        }
        if(usename.length()<3){
            usename.setError("username to short");
            usename.requestFocus();
            return;
        }
        if(EmailAddress.isEmpty()){
            emailaddress.setError("Enter emailaddress");
            emailaddress.requestFocus();
            return;
    }
        if(Patterns.EMAIL_ADDRESS.matcher(EmailAddress).matches()){
              emailaddress.setError("Enter valid emailAdress");
              emailaddress.requestFocus();
              return;
        }
        if(Password.isEmpty()){
            password.setError("Enter password");
            password.requestFocus();
            return;
        }
        if(Password.length()<8){
            password.setError("password too short");
            password.requestFocus();
            return;
        }
        if(Password.length()>30){
            password.setError("Password too long");
            password.requestFocus();
        }
        else{
            doRegister(Username,EmailAddress,Password,RePassword);
        }
    }

    private void doRegister(String username, String emailAddress, String password, String rePassword) {
            Call<LoginuserDetiles> call = RetrofitClints.getInstance().getSercivesAPI().register(username,emailAddress,password,password);
            call.enqueue(new Callback<LoginuserDetiles>() {
                @Override
                public void onResponse(Call<LoginuserDetiles> call, Response<LoginuserDetiles> response) {
                    if(response.isSuccessful()){
                        LoginuserDetiles resp = response.body();
                        if(resp.isError()){
                            Toast.makeText(RegisterScreen.this, String.valueOf(resp.getMessage()), Toast.LENGTH_SHORT).show();

                        }else{
                            Toast.makeText(RegisterScreen.this, String.valueOf(resp.getMessage()), Toast.LENGTH_SHORT).show();

                        }
                    }
                }

                @Override
                public void onFailure(Call<LoginuserDetiles> call, Throwable t) {

                    t.printStackTrace();
                }
            });
    }

}