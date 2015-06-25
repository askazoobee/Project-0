package com.example.littlebig.project_0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    //Declare as class variable
   private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

        //get string from strings.xml
       // String message = getString(R.string.toast_message);

        String message = "Launching the " + ((Button) view).getText().toString();


        //using switch to specify which app is being launched
     /*   switch (view.getId()){
            case R.id.button:
                message = "Opening Spotify Streamer App!";
            case R.id.button2:
                message = "Launching Scores App";

        }*/



        /* old code for toast...
        //redundant string-to-charsequence
        CharSequence text = message;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context,message,duration);
       toast.show();
        */
        int duration = Toast.LENGTH_SHORT;
        //Stop any previous toasts/tip from reviewer
        if(mAppToast !=null){
            mAppToast.cancel();
        }
        //Make and display new toast
        mAppToast = Toast.makeText(this,message,duration);
        mAppToast.show();
    }
}
