package com.example.root.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

    CharSequence toasttext = "";
    int duration = Toast.LENGTH_SHORT;
    Toast toast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      }

    public void showToast(View v)
    {
        switch (v.getId())
        {
            case R.id.spotify:
            case R.id.scores:
            case R.id.library:
            case R.id.builditbigger:
            case R.id.xyzreader:
            case R.id.caproject:
                displayToast(((Button) v).getText().toString());
                //Log.d("Buttontext",((Button) v).getText().toString() );
            default:
                break;
        }
    }

    private void displayToast(String s) {
        if (toast != null)
        {
            toast.cancel();
        }
        toast = Toast.makeText(getApplicationContext(),s,duration);
        toast.show();
    }

//Un Professional way in this case
//        Button button1 = (Button) findViewById(R.id.button1);
//        Button button2 = (Button) findViewById(R.id.button2);
//        Button button3 = (Button) findViewById(R.id.button3);
//        Button button4 = (Button) findViewById(R.id.button4);
//        Button button5 = (Button) findViewById(R.id.button5);
//        Button button6 = (Button) findViewById(R.id.button6);
//
//        button1.setOnClickListener(new OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                toasttext = "SPOTIFY STREAMER";
//                toast = Toast.makeText(getApplicationContext(), toasttext, duration);
//                toast.show();
//            }
//        });
//
//
//
//        button2.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                toasttext = "SCORES APP";
//                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
//                toast.show();
//            }
//        });
//
//        button3.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                toasttext = "LIBRARY APP";
//                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
//                toast.show();
//            }
//        });
//
//        button4.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                toasttext = "BUILD IT BIGGER";
//                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
//                toast.show();
//            }
//        });
//
//        button5.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                toasttext = "XYZ READER";
//                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
//                toast.show();
//            }
//        });
//
//        button6.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                toasttext = "Capstone Project";
//                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
//                toast.show();
//            }
//        });

}
