package com.example.facebooklogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Tag;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.tv_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Methods methods = RetrofitClient.getRetrofit().create(Methods.class);
                Call<Model> call = methods.getAllData();
                call.enqueue(new Callback<Model>() {
                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {
                        Log.e(TAG,"onResponse:code"+response.code() );

                        ArrayList<Model.data> data = response.body().getData();

                        for(Model.data data1:data){
                            Log.e(TAG,"onResponse:emails:"+data1.getEmail());

                        }

                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {

                    }
                });
            }
        });
    }
}