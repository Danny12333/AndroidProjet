package com.example.danieljoaquimpaulino.plusieuractivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {


    private Button Passemessage1 = null;
    private Button Passemessage2 = null;

    public final static int choose_Button_Request = 0;

    public final static String BUTTONS = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Passemessage1 = (Button)findViewById(R.id.btnGO1);
        Passemessage2 = (Button)findViewById(R.id.btnGO2);

        Passemessage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent secondeActivite = new Intent(MainActivity.this,Main2Activity.class);

                startActivityForResult(secondeActivite,choose_Button_Request);

            }
        });

      Passemessage2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent secondeActivite = new Intent(MainActivity.this,Main3Activity.class);

              startActivityForResult(secondeActivite,choose_Button_Request);


          }
      });
    }
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {


        if (requestCode == choose_Button_Request) {


            if (resultCode == RESULT_OK) {


                Toast.makeText(this, "Vous avez ferme l'activity " + data.getStringExtra(BUTTONS), Toast.LENGTH_LONG).show();
            }
        }

    }

}
