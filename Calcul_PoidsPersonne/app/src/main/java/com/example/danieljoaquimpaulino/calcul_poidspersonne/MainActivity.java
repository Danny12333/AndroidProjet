package com.example.danieljoaquimpaulino.calcul_poidspersonne;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText TAILL;

    TextView POIDS_RESUTL;

    RadioButton BTRADI1, BTRADI2;

    Button BTN1, BTN2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TAILL = (EditText)findViewById(R.id.Ext_TAIL);
        POIDS_RESUTL = (TextView) findViewById(R.id.Edt_POID_result);

        BTRADI1 = (RadioButton) findViewById(R.id.RAD_MAN);
        BTRADI2 = (RadioButton) findViewById(R.id.RAD_FEM);



        BTN1 = (Button) findViewById(R.id.BTN_CALC);
        BTN2 = (Button) findViewById(R.id.BTN_AN);


        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  String Taille = TAILL.getText().toString();

                float Taille = Integer.parseInt(TAILL.getText().toString());

                if(BTRADI1.isChecked())
                {





                    float Resul  =((100-Taille)-(150-Taille))/4;

                    POIDS_RESUTL.setText(Resul+"");



                }

                if(BTRADI2.isChecked())
                {



                    float Resul  =((100-Taille)-(150-Taille))/2;

                    POIDS_RESUTL.setText(Resul+"");






                }


            }
        });

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TAILL.setText("");
                POIDS_RESUTL.setText("");
            }
        });
    }
}
