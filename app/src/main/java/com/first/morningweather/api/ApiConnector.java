package com.first.morningweather.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.first.morningweather.FragmentToday;
import com.first.morningweather.MainActivity;
import com.first.morningweather.R;
import com.first.morningweather.api.data.MyPojo;
import com.first.morningweather.api.data.RealtimeWeatherStation;
import com.first.morningweather.api.data.Result;
import com.first.morningweather.api.data.Row;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sohee on 2017-12-12.
 */

public class ApiConnector {
    public static final String baseURL = "http://openapi.seoul.go.kr:8088/";

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public static void weatherApi(final Context context,final onDataUpdateListener listener){
        //http://openapi.seoul.go.kr:8088/59616f796c736f73383649525a4d46/xml/RealtimeWeatherStation/1/5/
        //final String serviceKey = context.getResources().getString(R.string.gov_weather_api_key)+"/json/RealtimeWeatherStation/1/5/";

        new Thread(new Runnable() {
            @Override
            public void run() {
                Api api = retrofit.create(Api.class);
                URL uri = null;

                //Call
                Call<MyPojo> call = api.getWeatherInformation();

               try{
                    Log.e("--", call.request().toString());
                   final List<Row> mRowResult = call.execute().body().getRealtimeWeatherStation().getRow();

                    ((Activity)context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            listener.onUpdated(mRowResult);
                        }
                    });

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }).start();
    }

    public interface onDataUpdateListener{
        public void onUpdated(List<Row> result);
    }
}
