package com.example.danieljoaquimpaulino.nombrecarre;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText Num;

    TextView CAR;

    Button BTN1, BTN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Num = (EditText)findViewById(R.id.Edit1);
        CAR = (TextView) findViewById(R.id.TxtV_Resultat);

        BTN1= (Button) findViewById(R.id.BtnCalculer);
        BTN2= (Button) findViewById(R.id.BtnAnuler);


        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int N1 = Integer.parseInt(Num.getText( )+"");

                int Result = N1*N1;

                CAR.setText(Result+"");
            }


        });

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

  Num.setText("");

  CAR.setText("");

            }
        });
    }
}
