package com.example.test.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tv11=(TextView)findViewById(R.id.textView5);
        tv11.setText(String.valueOf(getIntent().getExtras().getInt("Score")));

    }
    public void play(View view)
    {
        Intent a4=new Intent(Main4Activity.this,Main3Activity.class);
        startActivity(a4);
        finish();
    }
    public void exit(View view)
    {
        finish();
    }
}
