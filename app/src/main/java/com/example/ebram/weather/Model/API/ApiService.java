package com.example.ebram.weather.Model.API;

import com.example.ebram.weather.Model.POJO.Example;
import com.example.ebram.weather.Model.POJO.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface ApiService {

    @GET("/data/2.5/weather")
    Call < Example > getCurWeather(@Query("q") String city, @Query("appid") String apiKey);
    @GET("/data/2.5/weather")
    Call <List> getForcast(@Query("q") String city, @Query("cnt") String cnt, @Query("appid") String apiKey);
/*
    @GET("/data/2.5/weather?q=Paris&appid=cd3491d1adf0d046b57f42e31dff713e")
    Call < Example > getCurWeather2();*/
}
