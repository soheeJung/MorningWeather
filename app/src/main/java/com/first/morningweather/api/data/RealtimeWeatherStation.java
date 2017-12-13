package com.first.morningweather.api.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sohee on 2017-12-12.
 */

public class RealtimeWeatherStation {

    @SerializedName("list_total_count")
    @Expose
    private Integer listTotalCount;
    @SerializedName("RESULT")
    @Expose
    private Result rESULT;
    @SerializedName("row")
    @Expose
    private List<Row> row = null;

    public Integer getListTotalCount() {
        return listTotalCount;
    }

    public void setListTotalCount(Integer listTotalCount) {
        this.listTotalCount = listTotalCount;
    }

    public Result getRESULT() {
        return rESULT;
    }

    public void setRESULT(Result rESULT) {
        this.rESULT = rESULT;
    }

    public List<Row> getRow() {
        return row;
    }

    public void setRow(List<Row> row) {
        this.row = row;
    }
}
