package com.example.aleksander.helloworld5_2_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MessActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess);

        String user = new String("Жывотне");
        String mess = new String("ЧОЧО ПОПЯЧСА");

        String nUser = getIntent().getExtras().getString("username");
        String nMess = getIntent().getExtras().getString("mess");

        if (!nUser.isEmpty()){
            user = nUser;
        }

        if (!nMess.isEmpty()){
            mess = nMess;
        }

        TextView tv = findViewById(R.id.textViewMess);
        tv.setText(user + ", slysh, "+ mess);

        TextView ltv = findViewById(R.id.textView2);
        ltv.setMovementMethod(new ScrollingMovementMethod());
    }
}
