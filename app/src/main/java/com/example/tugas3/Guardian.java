package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Guardian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardian);
    }

    public void spiderman(View view){
        Intent a = new Intent(Guardian.this,SpiderMan.class);
        startActivity(a);
    }
    public void strange(View view){
        Intent a = new Intent(Guardian.this,MainActivity.class);
        startActivity(a);
    }
    public void avanger(View view){
        Intent a = new Intent(Guardian.this,Avanger.class);
        startActivity(a);
    }
}