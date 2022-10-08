package com.example.baitap_andoroi;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button btnlogin,btnsingin;
    EditText txtuser,txtpass;
    private void Anhxa(){
        txtuser = (EditText) findViewById(R.id.txtuser1);
        txtpass = (EditText) findViewById(R.id.txtpass1);
        btnlogin = (Button) findViewById(R.id.btnlogin1);
       btnsingin =(Button) findViewById(R.id.btnsingin1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = (Button) findViewById(R.id.btnlogin1);
        btnsingin = (Button) findViewById(R.id.btnsingin1);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this,home.class);
                startActivity(i);
            }
        });
        btnsingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this,singin.class);
                startActivity(i);
            }
        });
    }
}

