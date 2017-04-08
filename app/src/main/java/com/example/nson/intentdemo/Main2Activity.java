package com.example.nson.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvName, tvHobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvHobbies= (TextView) findViewById(R.id.tv_hobbies);
        tvName= (TextView) findViewById(R.id.tv_name);
        setByExtras();
    }
    public void setByExtras(){
        Intent intent= getIntent();
        String name= intent.getStringExtra(MainActivity.NAME);
        String hobbies= intent.getStringExtra(MainActivity.HOBBIES);
        tvName.setText(name);
        tvName.setText(hobbies);
    }
}
