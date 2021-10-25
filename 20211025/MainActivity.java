package com.cookandroid.test;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Toast tMsg;
    Display display;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast tMsg = Toast.makeText(MainActivity.this, "2016848042",
                    Toast.LENGTH_SHORT);

                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE))
                        .getDefaultDisplay();

                tMsg.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                tMsg.show();

                return true;
            case R.id.item2:
                tMsg = Toast.makeText(MainActivity.this, "박순",
                        Toast.LENGTH_SHORT);

                display = ((WindowManager) getSystemService(WINDOW_SERVICE))
                        .getDefaultDisplay();

                tMsg.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                tMsg.show();
                return true;
            case R.id.item3:
                tMsg = Toast.makeText(MainActivity.this, "박순 2016848042",
                        Toast.LENGTH_SHORT);

                display = ((WindowManager) getSystemService(WINDOW_SERVICE))
                        .getDefaultDisplay();

                tMsg.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                tMsg.show();
                return true;
        }
        return false;
    }
}
