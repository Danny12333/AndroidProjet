package com.example.danieljoaquimpaulino.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends Activity {

    private Button btn1 = null;
    private Button btn2= null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = (Button) findViewById(R.id.btnOne);



        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent result = new Intent();
                result.putExtra(MainActivity.BUTTONS, "1");
                setResult(RESULT_OK, result);
                finish();
            } });

        btn2 = (Button) findViewById(R.id.btntwo);



        btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent result = new Intent(); result.putExtra(MainActivity.BUTTONS, "2");
            setResult(RESULT_OK, result);
            finish();



        } });
    }



}
