package com.example.user.hansamustada_1202144142_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }

    //Todo: login cuy
    public void signIn(View view) {
        EditText username = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById(R.id.password);

        if(username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")){
            // email dan pass bener
            Intent intent = new Intent (LoginActivity.this, MainActivity.class);
            startActivity(intent);

            Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
        }else{

            Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_LONG).show();
            //wrong password

    }
    }
}

