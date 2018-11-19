package com.example.ebram.weather.Model.API;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class RetroClient {
    private static final String ROOT_URL="http://api.openweathermap.org";
    /**
     * Get Retrofit Instance
     */
    public static Retrofit retrofit;
    private static Retrofit getRetrofitInstance(){
        if (retrofit == null) {
            //Defining the Retrofit using Builder
            retrofit = new Retrofit.Builder()
                    .baseUrl(ROOT_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
      return retrofit;
    }
    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }
}
