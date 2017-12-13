package com.first.morningweather.api.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sohee on 2017-12-12.
 */

public class MyPojo {


    @SerializedName("RealtimeWeatherStation")
    @Expose
    private RealtimeWeatherStation realtimeWeatherStation;

    public RealtimeWeatherStation getRealtimeWeatherStation() {
        return realtimeWeatherStation;
    }

    public void setRealtimeWeatherStation(RealtimeWeatherStation realtimeWeatherStation) {
        this.realtimeWeatherStation = realtimeWeatherStation;
    }


}
