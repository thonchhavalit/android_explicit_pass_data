package com.youlayhang.explicit_pass_data;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        // Code to execute when the button is clicked
        Context context = view.getContext();
        CharSequence text = "Login Successfully!";
        int duration = Toast.LENGTH_SHORT;
        if(context==getBaseContext()){
            Toast.makeText(context, text, duration).show();
        }else {
            return;
        }

    }
}