package com.example.svasilovski.loginmaquetado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LuegoDelLoginActivity extends AppCompatActivity {
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luego_del_login);

        TextView textView = findViewById(R.id.lblWelcome);
        Intent intent = getIntent();
        user = intent.getStringExtra("USER_LOGIN").toString();
        textView.setText(String.format(getString(R.string.welcome), user));
    }
}
