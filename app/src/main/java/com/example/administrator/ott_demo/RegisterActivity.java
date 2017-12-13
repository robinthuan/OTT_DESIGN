package com.example.administrator.ott_demo;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
     Button button;
     final Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
       button=(Button)findViewById(R.id.act_register);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
             final  Dialog dialog=new Dialog(context);
              if(dialog!=null) {
                  dialog.setContentView(R.layout.custom_dialog);
                  dialog.setTitle("11111");
                  dialog.show();
              }

           }
       });
    }
}
