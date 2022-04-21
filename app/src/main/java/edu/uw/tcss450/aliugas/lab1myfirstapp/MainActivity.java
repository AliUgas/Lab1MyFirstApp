package edu.uw.tcss450.aliugas.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
//test
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "OnCreate()");
    }
    @Override
    protected void onStart() {
        Log.i(TAG, "OnStart()");
        super.onStart();
    }@Override
    protected void onResume() {
        Log.w(TAG, "OnResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "OnPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "OnStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "OnDestroy()");
        super.onDestroy();
    }

    @Override
        protected void onRestart() {
        Log.e(TAG, "OnRestart()");
        super.onRestart();
    }
}