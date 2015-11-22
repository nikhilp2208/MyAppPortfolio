package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMessage(View v) {
        Button button = (Button) v;
        String text = "This button will launch my "+button.getText().toString()+" app!";
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }
}
