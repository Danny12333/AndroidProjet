package com.example.danieljoaquimpaulino.callphone;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText Number;

    Button btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number = (EditText) findViewById(R.id.TxtNumber);

        btn1 = (Button) findViewById(R.id.btnCall);
        btn2 = (Button) findViewById(R.id.btnEnd);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                Intent Call1 = new Intent(Intent.ACTION_CALL);

                Call1.setData(Uri.parse("tel: " + Number.getText().toString()));
                startActivity(Call1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                Intent h = new Intent(Intent.ACTION_CALL);

                h.setData(Uri.parse("tel:+0628962646"));


                startActivity(h);
            }
        });

    }
}
