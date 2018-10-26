package com.example.danieljoaquimpaulino.messages;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {




    Button btnSend;
    EditText tvMessage;
    EditText tvNumber;
    IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        intentFilter = new IntentFilter();
        intentFilter.addAction("SMS_RECEIVED_ACTION");

        btnSend=(Button) findViewById(R.id.btnSend);
        tvMessage =(EditText) findViewById(R.id.tvMessage);
        tvNumber =(EditText) findViewById(R.id.tvNumber);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myMsg = tvMessage.getText().toString();
                String theNumber = tvNumber.getText().toString();

                sendMsg(theNumber,myMsg);


            }
        });

    }
    private BroadcastReceiver intenReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            TextView inTxl = (TextView) findViewById(R.id.txMsg);
            inTxl.setText(intent.getExtras().getString("messages"));


        }
    };


    protected  void sendMsg (String theNumber, String myMsg){

        String SENT = "Message sent";
        String DELIVERED = "Message Delivered";

        PendingIntent setPI = PendingIntent.getBroadcast(this,0,new Intent(SENT),0);
        PendingIntent delivered  = PendingIntent.getBroadcast(this,0,new Intent(DELIVERED),0);

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(theNumber,null,myMsg,setPI,delivered);

    }

    @Override

    protected void onResume(){

        registerReceiver(intenReceiver,intentFilter);
        super.onResume();

    }

    @Override

    protected void onPause(){

        registerReceiver(intenReceiver,intentFilter);
        super.onPause();

    }
}
