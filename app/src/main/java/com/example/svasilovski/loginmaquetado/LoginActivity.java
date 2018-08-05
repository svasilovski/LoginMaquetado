package com.example.svasilovski.loginmaquetado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void addUsuario(View view) {
    }

    public void loginUsuario(View view) {
        TextView txtUser = findViewById(R.id.txtUser);
        TextView txtPass = findViewById(R.id.txtPassword);
        if(loginUser(txtUser.getText().toString(), txtPass.getText().toString())){
            Intent intent = new Intent(this, LuegoDelLoginActivity.class);
            intent.putExtra("USER_LOGIN", txtUser.getText().toString());
            startActivity(intent);
        }
        else{
            Toast.makeText(this, getString(R.string.errLogin), Toast.LENGTH_SHORT).show();
        }
    }

    public boolean loginUser(String user, String password){
        return user.equals("educacion") && password.equals("password");
    }
}
