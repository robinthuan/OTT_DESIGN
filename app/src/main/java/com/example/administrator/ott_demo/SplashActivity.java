package com.example.administrator.ott_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Space;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      Thread thread=new Thread(new Runnable() {
          @Override
          public void run() {
              try {
                  Thread.sleep(3000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }finally {
                  startActivity(new Intent(SplashActivity.this,LoginActivity.class));
              }
          }
      });
      thread.start();
    }
}
