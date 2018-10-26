package com.example.danieljoaquimpaulino.sommedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input_n1, input_n2;

    TextView display_result;

    Button btn_Calculer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_n1= (EditText) findViewById(R.id.Edit1);
        input_n2= (EditText) findViewById(R.id.Edit2);

        display_result= (TextView) findViewById(R.id.display);

        btn_Calculer = (Button) findViewById(R.id.Btn1);

        btn_Calculer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(input_n1.getText().toString());
                int n2 = Integer.parseInt(input_n2.getText().toString());

                int Reslt = n1*n2;

                display_result.setText(Integer.toString(Reslt));


            }
        });




    }
}
