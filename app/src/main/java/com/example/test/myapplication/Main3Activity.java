package com.example.test.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private RadioGroup radiog;
    private RadioButton rad1;
    RadioButton rad2,rad3,rad4;
    private ImageView im1;
    private TextView tv10;
    private Button bt4;
    private Alert objAert2;
    private MediaPlayer mp2;
    private Question objQuestion;
    private String strAnswer;
    MediaPlayer mp3;
    int intTime = 1,userChoose,userScore;
    int userChooseArray[],trueAnswer[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        userChooseArray=new int[11];
        trueAnswer=new int[11];

        initialWidget();
        setValueTrueAnswer();

        mp3=MediaPlayer.create(this,R.raw.matto);
        mp2=MediaPlayer.create(this,R.raw.effect_btn_shut);
        bt4=(Button)findViewById(R.id.button3);
        radiog=(RadioGroup)findViewById(R.id.RadioGroup);
        rad1=(RadioButton)findViewById(R.id.radioButton);
        rad2=(RadioButton)findViewById(R.id.radioButton2);
        rad3=(RadioButton)findViewById(R.id.radioButton3);
        rad4=(RadioButton)findViewById(R.id.radioButton4);

        mp3.start();
        objQuestion=new Question();
        objQuestion.setOnQuestionChangelistener(new Question.onQuestionChangelistener() {
            @Override
            public void onQuestionChangelistener(Question question) {
                switch (question.getIntQuestion())
                {
                    case 1:
                        im1.setImageResource(R.drawable.ishihara_01);
                        rad1.setText(Main3Activity.this.getString(R.string.a1));
                        rad2.setText(Main3Activity.this.getString(R.string.a4));
                        rad3.setText(Main3Activity.this.getString(R.string.a8));
                        rad4.setText(Main3Activity.this.getString(R.string.a9));
                        radiog.clearCheck();

                        break;
                    case 2:
                        im1.setImageResource(R.drawable.ishihara_02);
                        rad1.setText(Main3Activity.this.getString(R.string.a10));
                        rad2.setText(Main3Activity.this.getString(R.string.a2));
                        rad3.setText(Main3Activity.this.getString(R.string.a8));
                        rad4.setText(Main3Activity.this.getString(R.string.a7));
                        radiog.clearCheck();
                        break;
                    case 3:
                        im1.setImageResource(R.drawable.ishihara_03);
                        rad1.setText(Main3Activity.this.getString(R.string.a1));
                        rad2.setText(Main3Activity.this.getString(R.string.a4));
                        rad3.setText(Main3Activity.this.getString(R.string.a3));
                        rad4.setText(Main3Activity.this.getString(R.string.a9));
                        radiog.clearCheck();
                        break;
                    case 4:
                        im1.setImageResource(R.drawable.ishihara_04);
                        rad1.setText(Main3Activity.this.getString(R.string.a1));
                        rad2.setText(Main3Activity.this.getString(R.string.a4));
                        rad3.setText(Main3Activity.this.getString(R.string.a8));
                        rad4.setText(Main3Activity.this.getString(R.string.a4));
                        radiog.clearCheck();
                        break;
                    case 5:
                        im1.setImageResource(R.drawable.ishihara_05);
                        rad1.setText(Main3Activity.this.getString(R.string.a5));
                        rad2.setText(Main3Activity.this.getString(R.string.a4));
                        rad3.setText(Main3Activity.this.getString(R.string.a8));
                        rad4.setText(Main3Activity.this.getString(R.string.a4));
                        radiog.clearCheck();
                        break;
                    case 6:
                        im1.setImageResource(R.drawable.ishihara_06);
                        rad1.setText(Main3Activity.this.getString(R.string.a1));
                        rad2.setText(Main3Activity.this.getString(R.string.a6));
                        rad3.setText(Main3Activity.this.getString(R.string.a8));
                        rad4.setText(Main3Activity.this.getString(R.string.a4));
                        radiog.clearCheck();
                        break;
                    case 7:
                        im1.setImageResource(R.drawable.ishihara_07);
                        rad1.setText(Main3Activity.this.getString(R.string.a1));
                        rad2.setText(Main3Activity.this.getString(R.string.a4));
                        rad3.setText(Main3Activity.this.getString(R.string.a7));
                        rad4.setText(Main3Activity.this.getString(R.string.a4));
                        radiog.clearCheck();
                        break;
                    case 8:
                        im1.setImageResource(R.drawable.ishihara_08);
                        rad1.setText(Main3Activity.this.getString(R.string.a1));
                        rad2.setText(Main3Activity.this.getString(R.string.a4));
                        rad3.setText(Main3Activity.this.getString(R.string.a9));
                        rad4.setText(Main3Activity.this.getString(R.string.a8));
                        radiog.clearCheck();
                        break;
                    case 9:
                        im1.setImageResource(R.drawable.ishihara_09);
                        rad1.setText(Main3Activity.this.getString(R.string.a9));
                        rad2.setText(Main3Activity.this.getString(R.string.a4));
                        rad3.setText(Main3Activity.this.getString(R.string.a8));
                        rad4.setText(Main3Activity.this.getString(R.string.a4));
                        radiog.clearCheck();
                        break;
                    case 10:
                        im1.setImageResource(R.drawable.ishihara_10);
                        rad1.setText(Main3Activity.this.getString(R.string.a1));
                        rad2.setText(Main3Activity.this.getString(R.string.a10));
                        rad3.setText(Main3Activity.this.getString(R.string.a8));
                        rad4.setText(Main3Activity.this.getString(R.string.a4));
                        radiog.clearCheck();
                        break;
                }
            }
        });

        radiog.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.radioButton:
                        userChoose=1;
                        strAnswer="1";
                        break;
                    case R.id.radioButton2:
                        userChoose=2;
                        strAnswer="1";
                        break;
                    case R.id.radioButton3:
                        userChoose=3;
                        strAnswer="1";
                        break;
                    case R.id.radioButton4:
                        userChoose=4;
                        strAnswer="1";
                        break;
                }
            }
        });


        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckChooseAnswer();
            }
        });

    }
    private void initialWidget()
    {
        im1=(ImageView)findViewById(R.id.imageView);
        tv10=(TextView)findViewById(R.id.textView3);
    }
    private void CheckChooseAnswer()
    {
        if (strAnswer !=null)
        {
            Log.d("Answer","intime = "+intTime);
            checkScore();
            intTime++;
        }
        else
        {
            Log.d("Please","something");
            objAert2=new Alert();
            objAert2.HaveSpace(Main3Activity.this);

        }
    }
    private void setValueTrueAnswer()
    {
        trueAnswer[1]=1;
        trueAnswer[2]=2;
        trueAnswer[3]=3;
        trueAnswer[4]=4;
        trueAnswer[5]=1;
        trueAnswer[6]=2;
        trueAnswer[7]=3;
        trueAnswer[8]=4;
        trueAnswer[9]=1;
        trueAnswer[10]=2;

    }
    private void checkScore()
    {
        userChooseArray[intTime]=userChoose;
        Log.d("ChooseArray","userChooseArray["+String.valueOf(intTime)+"]="+String.valueOf(userChoose));
        if (userChooseArray[intTime]==trueAnswer[intTime])
        {
            userScore++;
        }Log.d("score","userscore = "+String.valueOf(userScore));
        sentValueToQuestion();
    }
    private void sentValueToQuestion()
    {
        if (intTime==10)
        {
            Intent a3=new Intent(Main3Activity.this,Main4Activity.class);
            a3.putExtra("Score",userScore);
            mp3.stop();
            startActivity(a3);
            finish();
        }

        objQuestion.setIntQuestion(intTime+1);
    }
}
