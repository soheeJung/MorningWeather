package com.first.morningweather;

import android.widget.ImageView;

/**
 * Created by sohee on 2017-12-15.
 */

public class ListData {
    String mSeoulTxt;
    String mDegree;
    ImageView mHeart;

    public ListData(String mDegree, String mSeoulTxt, ImageView mHeart) {
        this.mDegree = mDegree;
        this.mHeart = mHeart;
        this.mSeoulTxt = mSeoulTxt;
    }

    public String getmDegree() {
        return mDegree;
    }

    public void setmDegree(String mDegree) {
        this.mDegree = mDegree;
    }

    public ImageView getmHeart() {
        return mHeart;
    }

    public void setmHeart(ImageView mHeart) {
        this.mHeart = mHeart;
    }

    public String getmSeoulTxt() {
        return mSeoulTxt;
    }

    public void setmSeoulTxt(String mSeoulTxt) {
        this.mSeoulTxt = mSeoulTxt;
    }
}

