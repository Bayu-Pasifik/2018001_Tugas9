package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpiderMan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spider_man);
    }

    public void strange(View view){
        Intent a = new Intent(SpiderMan.this,MainActivity.class);
        startActivity(a);
    }
    public void guardian(View view){
        Intent a = new Intent(SpiderMan.this,Guardian.class);
        startActivity(a);
    }
    public void avanger(View view){
        Intent a = new Intent(SpiderMan.this,Avanger.class);
        startActivity(a);
    }
}