package com.first.morningweather.api.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sohee on 2017-12-12.
 */

public class Result {

    @SerializedName("CODE")
    @Expose
    private String cODE;
    @SerializedName("MESSAGE")
    @Expose
    private String mESSAGE;

    public String getCODE() {
        return cODE;
    }

    public void setCODE(String cODE) {
        this.cODE = cODE;
    }

    public String getMESSAGE() {
        return mESSAGE;
    }

    public void setMESSAGE(String mESSAGE) {
        this.mESSAGE = mESSAGE;
    }
}
