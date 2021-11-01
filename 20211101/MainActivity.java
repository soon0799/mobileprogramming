package com.cookandroid.a20211101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnNewActivity;
    private EditText et_test;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test=findViewById(R.id.et_test);
        str = et_test.getText().toString();


        btnNewActivity = findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_test.getText().toString();
                Intent intent = new Intent(getApplicationContext(),
                        secondActivity.class);
                String name;
                intent.putExtra("str",str);

                startActivity((intent));
            }
        });

    }
}