package com.cookandroid.a20211101;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends Activity {

    private TextView sub_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        sub_text = findViewById(R.id.sub_text);

        Intent intent = getIntent();
        String str =intent.getStringExtra("str");

        sub_text.setText(str);


    }

}