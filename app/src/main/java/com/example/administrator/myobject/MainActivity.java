package com.example.administrator.myobject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v){
        Toast.makeText(this,"hah",Toast.LENGTH_LONG).show();
        startActivity(new Intent(this,Main2Activity.class));
    }
}
