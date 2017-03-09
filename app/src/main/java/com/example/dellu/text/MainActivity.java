package com.example.dellu.text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void toLinear(View view){
        Intent intent=new Intent(MainActivity.this,LinearActivity.class);
        startActivity(intent);
    }
    public void toTable(View view){
        Intent intent=new Intent(MainActivity.this,TableActivity.class);
        startActivity(intent);
    }
    public void toRelative(View view){
        Intent intent=new Intent(MainActivity.this,RelativeActivity.class);
        startActivity(intent);
    }

}


