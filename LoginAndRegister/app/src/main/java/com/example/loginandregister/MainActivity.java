package com.example.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LoginResponse loginResponse;
    TextView textView;
    Button butnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_wellcome);
        Intent intent = getIntent();
        if(intent.getExtras() != null){
            loginResponse =(LoginResponse) intent.getSerializableExtra("data");
            textView.setText(loginResponse.getEmail());
            Log.e("TAG","======>" +loginResponse.getEmail());

            butnGo = findViewById(R.id.butn_go);
            butnGo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,LoginScreen.class);
                    startActivity(intent);
                }
            });
        }
    }
}