package com.konstantin_morozov.mk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Toast.makeText(this, "This is a toast to Edit Activity", Toast.LENGTH_SHORT)
                .show();
    }
}
