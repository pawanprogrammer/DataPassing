package com.trishasofttech.constructordatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
/*declare the java objets for xml widgts*/
    EditText et_username, et_password;
    Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*to change the ActionBar Title name*/
        getSupportActionBar().setTitle("MainActivity");
        /*intialize the java object from xml widgets*/
        btn_next = findViewById(R.id.btn_next);
        //pawan                              pawan
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);

        /*to click on the next button*/
        /*to switch the HomeActivity*/
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*pass the function to perform after click*/
                /*data pass using Intent*/
                Intent next = new Intent(MainActivity.this, HomeActivity.class);
                /*to attach the data with intent object*/
                next.putExtra("namekey", et_username.getText().toString().trim());
                next.putExtra("passwordkey", et_password.getText().toString().trim());
                startActivity(next);
            }
        });

    }
}