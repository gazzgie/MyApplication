package com.example.test.myapplication;

/**
 * Created by Gazzgie on 19/12/2560.
 */

public class Question {
    int intQuestion;
    public interface onQuestionChangelistener
    {
        void onQuestionChangelistener(Question question);
    }

    private onQuestionChangelistener onQuestionChangelistener;

    public void setOnQuestionChangelistener(onQuestionChangelistener onQuestionChangelistener)
    {
        this.onQuestionChangelistener=onQuestionChangelistener;
    }

    public int getIntQuestion()
    {
        return intQuestion;
    }

    public void setIntQuestion(int intQuestion)
    {
        this.intQuestion=intQuestion;
        if (this.onQuestionChangelistener !=null)
        {
            this.onQuestionChangelistener.onQuestionChangelistener(this);
        }
    }
}
