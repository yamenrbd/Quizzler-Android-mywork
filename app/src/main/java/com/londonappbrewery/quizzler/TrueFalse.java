package com.londonappbrewery.quizzler;

/**
 * Created by yamen on 11/10/2017.
 */

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int questionResourseIs , boolean trueOrFalse){
        mQuestionId = questionResourseIs;
        mAnswer = trueOrFalse;
        //test git

    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
