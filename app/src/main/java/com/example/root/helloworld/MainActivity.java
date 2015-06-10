package com.example.root.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                toasttext = "SPOTIFY STREAMER";
                toast = Toast.makeText(getApplicationContext(), toasttext, duration);
                toast.show();
            }
        });



        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                toasttext = "SCORES APP";
                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
                toast.show();
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                toasttext = "LIBRARY APP";
                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
                toast.show();
            }
        });

        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                toasttext = "BUILD IT BIGGER";
                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
                toast.show();
            }
        });

        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                toasttext = "XYZ READER";
                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
                toast.show();
            }
        });

        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                toasttext = "Capstone Project";
                toast = Toast.makeText(getApplicationContext(), toasttext,duration);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
