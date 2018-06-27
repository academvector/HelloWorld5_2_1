package com.example.aleksander.helloworld5_2_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText mName;
    EditText mMess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonPressed(View view) {
        mName = findViewById(R.id.editText);
        mMess = findViewById(R.id.editTextMess);

        Intent intent = new Intent(this, MessActivity.class);
        intent.putExtra("username", mName.getText().toString());
        intent.putExtra("mess", mMess.getText().toString());
        startActivity(intent);
    }
}
