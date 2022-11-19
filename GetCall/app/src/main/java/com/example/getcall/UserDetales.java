package com.example.getcall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDetales extends AppCompatActivity {

    private RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    private List<ModelUser> modelUserList;
    UserAdapter UserAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detales);
        linearLayoutManager = new LinearLayoutManager(this);
        //modelUserList =new ArrayList<>();
        Call<UserResponse> registerResponseCall1 = RetrofitClient.getServices().getUser();
        Log.e("Error","Respuest Sent");
        registerResponseCall1.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {

                if(response.isSuccessful()){


                    UserResponse ur=response.body();
                    modelUserList=ur.data;
                    recyclerView = findViewById(R.id.rc_userdetails);

                    linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    UserAdapter =new UserAdapter(modelUserList);
                    recyclerView.setAdapter((RecyclerView.Adapter) UserAdapter);


                }else{
                    String message = "An error occurred please try again later...";
                    message =response.toString();
                    Log.e("Error",message);

                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {

                String message = t.getLocalizedMessage();


            }
        });

        //modelUserList.add(new ModelUser(123,"pra123@gmail.com","praveen","p",""));
        //modelUserList.add(new ModelUser(456,"morura123@gmail.com","mourya","p",""));

/*
        recyclerView = findViewById(R.id.rc_userdetails);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        UserAdapter =new UserAdapter(modelUserList);
        recyclerView.setAdapter((RecyclerView.Adapter) UserAdapter);

 */
    }
}