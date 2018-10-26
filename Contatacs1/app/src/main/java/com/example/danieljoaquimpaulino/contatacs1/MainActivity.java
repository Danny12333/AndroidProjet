package com.example.danieljoaquimpaulino.contatacs1;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends Activity {

    ListView LSV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                    LSV = (ListView)findViewById(R.id.LstV);



    }

    public void GET(View V){


          Cursor Moncursor = getContentResolver().query(ContactsContract.CommonDataKinds.
                   Phone.CONTENT_URI,null,null,null,null);

                   startManagingCursor(Moncursor);

            String [] MyString = {
                   ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                   ContactsContract.CommonDataKinds.Phone.NUMBER,
                   ContactsContract.CommonDataKinds.Phone._ID

   };

        int [] txtV = {android.R.id.text1, android.R.id.text2};
        

           SimpleCursorAdapter SAD =

                   new SimpleCursorAdapter(this,android.R.layout.
                   simple_expandable_list_item_2,Moncursor,MyString,txtV);

                   LSV.setAdapter(SAD);
                   LSV.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }
}
