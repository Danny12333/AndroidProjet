package com.example.danieljoaquimpaulino.plusieuractivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends Activity {

    EditText n1, n2 ;

    TextView ResultSomm1;

    Button btn1, btn2;


    private Button btn11 = null;
    private Button btn22= null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



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


        //------------------------------------------------------------------




        btn11 = (Button) findViewById(R.id.btnOne);



        btn11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent result = new Intent();
                result.putExtra(MainActivity.BUTTONS, "1");
                setResult(RESULT_OK, result);
                finish();
            } });



    }
}
