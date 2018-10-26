package com.example.danieljoaquimpaulino.moyenne;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText not1, not2, not3, Result;

    Button btnResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
    }
}
