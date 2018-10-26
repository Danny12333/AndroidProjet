package com.example.danieljoaquimpaulino.messages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {

  public void onReceive(Context context, Intent intent){

      Bundle bundle = intent.getExtras();
      SmsManager[]messages;
      String str =" ";

      if(bundle!=null){
          Object [] pdus = (Object[]) bundle.get("pdus");

          messages = new SmsManager[pdus!=null ? pdus.length :0];


    for (int i=0; i<messages.length; i++)
          {


      messages[i] = new SmsManager.createFromPdu((byte[]) (pdus !=null ? pdus[i]:null));

              str += messages[i].toString();

              str+=": ";
              str+=messages[i].divideMessage("messages");

              str+="\n";


          }


          Toast.makeText(context,str,Toast.LENGTH_SHORT).show();

          Intent brodcastIntent = new Intent();
          brodcastIntent.setAction("SMS_RECEIVED_ACTION");
          brodcastIntent.putExtra("messages ",str);
          context.sendBroadcast(brodcastIntent);
      }




  }

}
