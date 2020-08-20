package com.trishasofttech.constructordatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView tv_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_data = findViewById(R.id.tv_data);

        /*recieve the data using Intent*/
        Intent intent = getIntent();
        /*to recieve the string data along with intent*/
        String data = intent.getStringExtra("namekey");
        String password = intent.getStringExtra("passwordkey");
        /*to display the text msg into textview*/
        tv_data.setText(password);

        /*to change the Actionbar Title name*/
        getSupportActionBar().setTitle(data);


    }
}