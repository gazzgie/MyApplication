package com.example.test.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt1,edt2,edt3,edt4,edt5,edt6;
    private Button bt1;
    private Alert objAlertspace;
    private MediaPlayer mp1;
    private String strSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=(EditText)findViewById(R.id.editText);
        edt2=(EditText)findViewById(R.id.editText2);
        edt3=(EditText)findViewById(R.id.editText3);
        edt4=(EditText)findViewById(R.id.editText4);
        edt5=(EditText)findViewById(R.id.editText8);
        edt6=(EditText)findViewById(R.id.editText9);
        bt1=(Button)findViewById(R.id.button);
        mp1=MediaPlayer.create(this,R.raw.effect_btn_shut);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();

                try {
                    strSpace=edt1.getText().toString().trim();
                    strSpace=edt2.getText().toString().trim();
                    strSpace=edt3.getText().toString().trim();
                    strSpace=edt4.getText().toString().trim();
                    strSpace=edt5.getText().toString().trim();
                    strSpace=edt6.getText().toString().trim();
                    if (strSpace.equals(""))
                    {
                        objAlertspace=new Alert();
                        objAlertspace.HaveSpace(MainActivity.this);
                    }
                    else
                    {
                        Intent a1=new Intent(MainActivity.this,Main2Activity.class);
                        a1.putExtra("name",edt1.getText().toString());
                        a1.putExtra("sir",edt2.getText().toString());
                        a1.putExtra("email",edt3.getText().toString());
                        a1.putExtra("phone",edt4.getText().toString());
                        a1.putExtra("id",edt5.getText().toString());
                        a1.putExtra("pass",edt6.getText().toString());
                        startActivity(a1);
                    }
                }catch (Exception e){}








            }
        });



    }
}
