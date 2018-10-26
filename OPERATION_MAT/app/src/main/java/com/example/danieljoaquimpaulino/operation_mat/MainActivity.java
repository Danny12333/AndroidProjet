package com.example.danieljoaquimpaulino.operation_mat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText Num1, Num2;

    TextView Txt_Result ;

    Button BTN1, BTN2;

    RadioButton RBTN1, RBTN2, RBTN3, RBTN4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText)findViewById(R.id.Edit_N1);
        Num2 = (EditText)findViewById(R.id.Edit_N2);
        Txt_Result = (TextView) findViewById(R.id.Txt_Result);
        BTN1 = (Button) findViewById(R.id.Btn_Calcul);
        BTN2 = (Button) findViewById(R.id.Btn_Annul);



        RBTN1 = (RadioButton)findViewById(R.id.Rad_Som);
        RBTN2 = (RadioButton) findViewById(R.id.Rad_Subtrat);
        RBTN3 = (RadioButton) findViewById(R.id.Rad_Produit);
        RBTN4 = (RadioButton) findViewById(R.id.Rad_Div);

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float N1 = Integer.parseInt(Num1.getText()+"");
                float N2 = Integer.parseInt(Num2.getText()+"");


                if(RBTN1.isChecked()){


                    float  REST=N1+N2;

                 Txt_Result.setText(REST+"");
                }

                if(RBTN2.isChecked()){


                    float  REST=N1-N2;

                    Txt_Result.setText(REST+"");
                }

                if(RBTN3.isChecked()){


                    float  REST=N1*N2;

                    Txt_Result.setText(REST+"");

                }

                if(RBTN4.isChecked()){


                    float  REST=N1/N2;

                    Txt_Result.setText(REST+"");
                }

            }


        });
BTN2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Num1.setText("");
        Num2.setText("");
        Txt_Result.setText("");
    }
});
    }
}
