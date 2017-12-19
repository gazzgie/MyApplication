package com.example.test.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4,tv5,tv6;
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1=(TextView)findViewById(R.id.textView15);
        tv2=(TextView)findViewById(R.id.textView16);
        tv3=(TextView)findViewById(R.id.textView19);
        tv4=(TextView)findViewById(R.id.textView20);
        tv5=(TextView)findViewById(R.id.textView17);
        tv6=(TextView)findViewById(R.id.textView18);

        tv1.setText(getIntent().getStringExtra("name"));
        tv2.setText(getIntent().getStringExtra("sir"));
        tv3.setText(getIntent().getStringExtra("email"));
        tv4.setText(getIntent().getStringExtra("phone"));
        tv5.setText(getIntent().getStringExtra("id"));
        tv6.setText(getIntent().getStringExtra("pass"));

        bt2=(Button)findViewById(R.id.button2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a2=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(a2);
            }
        });
    }
}
