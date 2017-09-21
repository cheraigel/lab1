package com.example.cheraigel.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    private  EditText fname,lname,Emailaddress,phoneNumber,Password;

            private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fname =  (EditText) findViewById(R.id.fname);
        lname =  (EditText) findViewById(R.id.lname);
        Emailaddress= (EditText) findViewById(R.id.EmailAddress);
        Password = (EditText) findViewById(R.id.Password);
        phoneNumber = (EditText) findViewById(R.id.username);
        create = (Button) findViewById(R.id.button);


        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = fname.getText().toString();
                String lname = lname.getText().toString();
                String Emailaddress = emailaddress.getText().toString();
                String phoneNumber = phoneNumber.getText().toString();
                String pass = password.getText().toString();
                startActivity(new Intent(create.this, HomeActivity.class));
            }
        });


        }
    }
