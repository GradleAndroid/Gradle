package com.example.loginapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText emailid;
    EditText password;
    Button loginbutton;

    String varUsername, varPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailid = findViewById(R.id.emailid);
        password = findViewById(R.id.password);
        loginbutton = findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(v -> {
            varUsername = emailid.getText().toString();
            varPassword = password.getText().toString();

            if (varUsername.equals("21CSC02") && varPassword.equals("SHIVA"))
                Toast.makeText(getApplicationContext(),"Login Successful", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(getApplicationContext(),"Check Credentials", Toast.LENGTH_LONG).show();


        });


    }
}