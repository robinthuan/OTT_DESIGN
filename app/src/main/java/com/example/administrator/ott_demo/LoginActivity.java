package com.example.administrator.ott_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    Button register,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register=(Button)findViewById(R.id.register);
        login=(Button)findViewById(R.id.login);
        register.setOnClickListener(this);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                break;
            case R.id.register:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                break;
                default:break;
        }
    }
}
