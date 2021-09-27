
package com.cookandroid.baseapp2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1;
    Button btnHomepage,btn911,btngallery,btnfinish;
    RadioButton rdoQ, rdoR;
    ImageView ivAndroid;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHomepage = (Button) findViewById(R.id.btnHomepage);
        btnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.nate.com"));
                startActivity(mIntent);
            }
        });

        btn911 = (Button) findViewById(R.id.btn911);
        btn911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });

        btngallery = (Button) findViewById(R.id.btngallery);
        btngallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        btnfinish= (Button) findViewById(R.id.btnfinish);
        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}

