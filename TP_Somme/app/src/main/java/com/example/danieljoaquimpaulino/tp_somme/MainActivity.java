package com.example.danieljoaquimpaulino.tp_somme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EmptyStackException;

public class MainActivity extends Activity {


    EditText n1, n2 ;

    TextView ResultSomm1;

    Button btn1, btn2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.Edt1);
        n2=(EditText)findViewById(R.id.Edt2);
        ResultSomm1 =(TextView) findViewById(R.id.somme1);

        btn1 =(Button) findViewById(R.id.btnCalculer);
        btn2 =(Button) findViewById(R.id.btnAnnuler);


        // Button CALCULER

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n11 = Integer.parseInt(n1.getText()+"");
                int n22 = Integer.parseInt(n2.getText()+"");

                int Resul = n11+n22;


                ResultSomm1.setText(Resul+"");


            }
        });

// Button VIDER

btn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

                n1.setText("");
                n2.setText("");
                ResultSomm1.setText("");

    }
});


    }
}
