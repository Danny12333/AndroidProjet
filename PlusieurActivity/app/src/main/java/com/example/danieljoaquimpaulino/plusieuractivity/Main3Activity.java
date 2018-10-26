package com.example.danieljoaquimpaulino.plusieuractivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends Activity {


    EditText not1, not2, not3, Result;

    Button btnResult;


    private Button btn22= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        not1 = (EditText)findViewById(R.id.Edit1);
        not2 = (EditText)findViewById(R.id.Edit2);
        not3 = (EditText)findViewById(R.id.Edit3);

        btnResult = (Button)findViewById(R.id.btnCalculer);

        Result =(EditText)findViewById(R.id.EditResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(not1.getText().toString());
                int n2 = Integer.parseInt(not2.getText().toString());
                int n3 = Integer.parseInt(not3.getText().toString());

                int RESULT = (n1+n2+n3)/3;

                Result.setText(Integer.toString(RESULT));


            }
        });

        btn22 = (Button) findViewById(R.id.btntwo);



        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent(); result.putExtra(MainActivity.BUTTONS, "2");
                setResult(RESULT_OK, result);
                finish();



            } });
    }
}
