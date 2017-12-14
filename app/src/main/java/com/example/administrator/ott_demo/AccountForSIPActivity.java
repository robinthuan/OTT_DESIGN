package com.example.administrator.ott_demo;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by administrator on 12/14/17.
 */

public class AccountForSIPActivity extends AppCompatActivity {
    Button buttonSave;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_for_sip);
        final Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.dialog_edit_sip_account);
        Button update=(Button) dialog.findViewById(R.id.update);
        Button cancel=(Button) dialog.findViewById(R.id.cancle);
       buttonSave=(Button)findViewById(R.id.bttsave);
       buttonSave.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               dialog.show();
               dialog.setCanceledOnTouchOutside(false);
           }
       });
       update.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(AccountForSIPActivity.this,HomeActivity.class));
           }
       });
       cancel.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            if(dialog.isShowing()) dialog.dismiss();
           }
       });
    }
}
