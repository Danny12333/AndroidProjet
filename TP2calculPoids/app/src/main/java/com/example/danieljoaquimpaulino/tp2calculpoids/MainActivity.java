

package com.example.danieljoaquimpaulino.tp2calculpoids;



import android.app.Activity;
import android.database.CursorJoiner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import javax.xml.transform.Result;

public class MainActivity extends Activity {

    // Declaration de Variable

    EditText TAILL;

    TextView POIDSRESUTL;

    RadioButton BTRADI1, BTRADI2;

    Button BTN1, BTN2;

      double a,b;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TAILL = (EditText)findViewById(R.id.Ext_TAIL);

        POIDSRESUTL = (TextView) findViewById(R.id.txtPOIDResult);

        BTRADI1 = (RadioButton) findViewById(R.id.RAD_MAN);
        BTRADI2 = (RadioButton) findViewById(R.id.RAD_FEM);



        BTN1 = (Button) findViewById(R.id.BTN_CALC);
        BTN2 = (Button) findViewById(R.id.BTN_AN);

// Le boutton Calculer

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {







                double Taille = Integer.parseInt(TAILL.getText().toString());


                       a=4;
                       b=2.5;


          if(BTRADI1.isChecked()) {


                if(Taille<100) {

                    Toast.makeText(getApplicationContext(), "La taille doit etre superieur à 100 cm", Toast.LENGTH_LONG).show();

                }



                  double  Result = (Taille-100)-((Taille - 150) / 4);

                 POIDSRESUTL.setText(Result + "");


                }

                  if(BTRADI2.isChecked()) {



                        if(Taille<100) {

                            Toast.makeText(getApplicationContext(), "La taille doit etre superieur à 100 cm", Toast.LENGTH_LONG).show();

                        }

                      double  Result = (Taille-100)-((Taille - 150) / 2.5);

                      POIDSRESUTL.setText(Result + "");


        }

      }


        });
        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TAILL.setText("");
                POIDSRESUTL.setText("");

            }
        });
}
       
}
