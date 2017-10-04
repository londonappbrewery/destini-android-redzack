package com.londonappbrewery.destini;

/**
 * Created by Dell on 04-Oct-17.
 */

public class Destiny {
    private int mStoryNum;
    private int mTopButtonNum;
    private int mBottomButtonNum;

    public Destiny(int mStoryNum, int mTopButtonNum, int mBottomButtonNum) {
        this.mStoryNum = mStoryNum;
        this.mTopButtonNum = mTopButtonNum;
        this.mBottomButtonNum = mBottomButtonNum;
    }

    public int getStoryNum() {
        return mStoryNum;
    }

    public void setStoryNum(int storyNum) {
        mStoryNum = storyNum;
    }

    public int getTopButtonNum() {
        return mTopButtonNum;
    }

    public void setTopButtonNum(int topButtonNum) {
        mTopButtonNum = topButtonNum;
    }

    public int getBottomButtonNum() {
        return mBottomButtonNum;
    }

    public void setBottomButtonNum(int bottomButtonNum) {
        mBottomButtonNum = bottomButtonNum;
    }
}
