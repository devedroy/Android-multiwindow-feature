package com.example.androidmultiwindowfeature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class AdjacentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjacent);

        if (isInMultiWindowMode()){
            Toast.makeText(this, "I was launched in Multi-window mode", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "I wasn't launched in Multi-window mode", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);

        if(isInMultiWindowMode) {
            Toast.makeText(this, "I am in Multi-window mode", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "I am not in Multi-window mode", Toast.LENGTH_LONG).show();
        }
}
