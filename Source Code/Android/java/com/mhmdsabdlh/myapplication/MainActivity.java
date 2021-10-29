package com.mhmdsabdlh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        TextView numO = (TextView)findViewById(R.id.numOne);
        TextView numT = (TextView)findViewById(R.id.numTwo);

        if (TextUtils.isEmpty(numO.getText().toString()) || TextUtils.isEmpty(numT.getText().toString())){
            Toast.makeText(MainActivity.this,
                    "Empty field not allowed!",
                    Toast.LENGTH_SHORT).show();
        }
        else {
            int nOne = Integer.parseInt((numO.getText().toString()));
            int nTwo = Integer.parseInt((numT.getText().toString()));
            if (nOne < 16 && nTwo < 14)
                alertDialog.setMessage("You are " + nOne + " man,and she is only " + nTwo + " ,Dont think about it!");
            else if (nOne < 16)
                alertDialog.setMessage("You are " + nOne + " man, you too young!");
            else if (nTwo < 14)
                alertDialog.setMessage("She is only " + nTwo + " , Don't think about it!");
            else if (nOne > (nTwo / 2 + 7) && nOne < (nTwo * 2 - 14))
                alertDialog.setMessage("Absolutely, DO IT!");
            else
                alertDialog.setMessage("Not the right one, there is a big difference of age");
            alertDialog.show();
        }
    }
    }