package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"--on-Create--");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"--on-Start--");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"--on-Restart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"--on-Resume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"--on-Pause--");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"--on-Stop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"--on-Destroy--");
    }
}