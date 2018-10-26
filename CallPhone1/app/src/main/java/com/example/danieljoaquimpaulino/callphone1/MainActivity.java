package com.example.danieljoaquimpaulino.callphone1;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;

import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final int REQUEST_CALL = 1;
    TextView number;
    Button[] btnlist;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11;
    ImageButton phone, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phone = findViewById(R.id.phone);
        back = findViewById(R.id.back);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        number = (TextView) findViewById(R.id.number);
        btnlist = new Button[]{btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11};
        for (int i = 0; i <= 11; i++) {
            btnlist[i].setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
            btnlist[i].setOnClickListener(this);

        }


            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (number.getText().toString() != null && number.getText().toString().length() > 0)
                        number.setText(number.getText().toString().substring(0, number.getText().toString().length() - 1));

                }
            });

            phone.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    makeCall();
                }
            });


    }



    @TargetApi(23)
    private void makeCall(){
        String callnumber = number.getText().toString();
        final Intent icall = new Intent(Intent.ACTION_CALL);
        icall.setData(Uri.parse("tel:" + number.getText().toString()));

        if (callnumber.length() > 0) {

            if (android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.LOLLIPOP && checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                makeCall();
            }
            else
                startActivity(icall);
        }
        else {Toast.makeText(MainActivity.this,"Entrer un numero",Toast.LENGTH_SHORT);
        }

    }


    @Override

    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn0:{number.append("1") ;break;}
            case R.id.btn1:{ number.append("2");break;}
            case R.id.btn2:{number.append("3");break;}
            case R.id.btn3:{ number.append("4");break;}
            case R.id.btn4:{ number.append("5");break;}
            case R.id.btn5:{number.append("6");break;}
            case R.id.btn6:{number.append("7");break;}
            case R.id.btn7:{number.append("8");break;}
            case R.id.btn8:{number.append("9");break;}
            case R.id.btn9:{number.append("*");break;}
            case R.id.btn10:{number.append("0");break;}
            case R.id.btn11:{number.append("#");break;}

        }
    }
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults){
        if(requestCode==REQUEST_CALL)
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission GRANTED", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
    }


}
