package com.first.morningweather.api.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sohee on 2017-12-12.
 */

public class Row {
    @SerializedName("SAWS_OBS_TM")
    @Expose
    private String sAWSOBSTM;
    @SerializedName("STN_NM")
    @Expose
    private String sTNNM;
    @SerializedName("STN_ID")
    @Expose
    private String sTNID;
    @SerializedName("SAWS_TA_AVG")
    @Expose
    private Double sAWSTAAVG;
    @SerializedName("SAWS_HD")
    @Expose
    private Double sAWSHD;
    @SerializedName("CODE")
    @Expose
    private String cODE;
    @SerializedName("NAME")
    @Expose
    private String nAME;
    @SerializedName("SAWS_WS_AVG")
    @Expose
    private Double sAWSWSAVG;
    @SerializedName("SAWS_RN_SUM")
    @Expose
    private Double sAWSRNSUM;
    @SerializedName("SAWS_SOLAR")
    @Expose
    private Double sAWSSOLAR;
    @SerializedName("SAWS_SHINE")
    @Expose
    private Double sAWSSHINE;

    public String getSAWSOBSTM() {
        return sAWSOBSTM;
    }

    public void setSAWSOBSTM(String sAWSOBSTM) {
        this.sAWSOBSTM = sAWSOBSTM;
    }

    public String getSTNNM() {
        return sTNNM;
    }

    public void setSTNNM(String sTNNM) {
        this.sTNNM = sTNNM;
    }

    public String getSTNID() {
        return sTNID;
    }

    public void setSTNID(String sTNID) {
        this.sTNID = sTNID;
    }

    public Double getSAWSTAAVG() {
        return sAWSTAAVG;
    }

    public void setSAWSTAAVG(Double sAWSTAAVG) {
        this.sAWSTAAVG = sAWSTAAVG;
    }

    public Double getSAWSHD() {
        return sAWSHD;
    }

    public void setSAWSHD(Double sAWSHD) {
        this.sAWSHD = sAWSHD;
    }

    public String getCODE() {
        return cODE;
    }

    public void setCODE(String cODE) {
        this.cODE = cODE;
    }

    public String getNAME() {
        return nAME;
    }

    public void setNAME(String nAME) {
        this.nAME = nAME;
    }

    public Double getSAWSWSAVG() {
        return sAWSWSAVG;
    }

    public void setSAWSWSAVG(Double sAWSWSAVG) {
        this.sAWSWSAVG = sAWSWSAVG;
    }

    public Double getSAWSRNSUM() {
        return sAWSRNSUM;
    }

    public void setSAWSRNSUM(Double sAWSRNSUM) {
        this.sAWSRNSUM = sAWSRNSUM;
    }

    public Double getSAWSSOLAR() {
        return sAWSSOLAR;
    }

    public void setSAWSSOLAR(Double sAWSSOLAR) {
        this.sAWSSOLAR = sAWSSOLAR;
    }

    public Double getSAWSSHINE() {
        return sAWSSHINE;
    }

    public void setSAWSSHINE(Double sAWSSHINE) {
        this.sAWSSHINE = sAWSSHINE;
    }
}
