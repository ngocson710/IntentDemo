package com.example.nson.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NAME= "NAME";
    public static final String HOBBIES= "HOBBIES";
    EditText edtname, edtHobbies;
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtHobbies= (EditText) findViewById(R.id.edt_Hobbi);
        edtname= (EditText) findViewById(R.id.edt_Name);
        btnSend= (Button) findViewById(R.id.btn_SendData);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= edtname.getText().toString();
                String hobbies= edtHobbies.getText().toString();
                byExtras(name, hobbies);
            }
        });
    }
    public void byExtras(String name, String hobbies){
        Intent intent=new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra(NAME, name);
        intent.putExtra(HOBBIES, hobbies);
        startActivity(intent);
    }
}
