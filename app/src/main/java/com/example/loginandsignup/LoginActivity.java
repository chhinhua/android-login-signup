package com.example.loginandsignup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView goToMain = findViewById(R.id.imageViewGoToMain);
        goToMain.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, MainActivity.class)));

        TextView register = findViewById(R.id.textViewRegister);
        register.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, SignupActivity.class)));
    }
}
