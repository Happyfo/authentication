package com.example.agnes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etemail,etpassword;
    Button btnlogin;
    TextView registerlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etemail=(EditText)findViewById(R.id.etmail);
        etpassword=(EditText)findViewById(R.id.etpass);
        registerlink= (TextView)findViewById(R.id.btnlogin);
        btnlogin= (Button)findViewById(R.id.btnregister);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userLogin();


            }
        });
    }
    public void userLogin(){

        String email= etemail.getText().toString().trim();
        String password= etpassword.getText().toString().trim();

        if (email.isEmpty()){
            Toast.makeText(MainActivity.this, "Enter your Email",Toast.LENGTH_LONG).show();
        }
        if (password.isEmpty()){
            Toast.makeText(MainActivity.this, "Enter the Password ",Toast.LENGTH_LONG).show();
        }

        if (email.equals("agnes") && password.equals("agnes")){
            Toast.makeText(MainActivity.this, "login success!!!!!",Toast.LENGTH_LONG).show();
            Intent gotoregister= new Intent(this,Register.class);
            startActivity(gotoregister);
        }

        else {

            Toast.makeText(MainActivity.this, "Incorect username or password",Toast.LENGTH_LONG).show();
        }
    }





}
