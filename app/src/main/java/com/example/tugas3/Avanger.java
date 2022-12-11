package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Avanger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avanger);
    }
    public void spiderman(View view){
        Intent a = new Intent(Avanger.this,SpiderMan.class);
        startActivity(a);
    }
    public void guardian(View view){
        Intent a = new Intent(Avanger.this,Guardian.class);
        startActivity(a);
    }
    public void strange(View view){
        Intent a = new Intent(Avanger.this,MainActivity.class);
        startActivity(a);
    }
}