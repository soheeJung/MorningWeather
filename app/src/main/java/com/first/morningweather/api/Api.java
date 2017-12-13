package com.first.morningweather.api;


import com.first.morningweather.api.data.MyPojo;
import com.first.morningweather.api.data.RealtimeWeatherStation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by sohee on 2017-12-12.
 */

public interface Api {
    @GET("/59616f796c736f73383649525a4d46/json/RealtimeWeatherStation/1/5/")
    Call<MyPojo> getWeatherInformation();
}
