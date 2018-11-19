package com.example.ebram.weather.View;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.ebram.weather.Adapter.WeatherAdapter;
import com.example.ebram.weather.Model.API.ApiService;
import com.example.ebram.weather.Model.API.RetroClient;
import com.example.ebram.weather.Model.POJO.List;
import com.example.ebram.weather.R;

import java.util.ArrayList;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class Forcast extends Activity {
    WeatherAdapter adapter;
    RecyclerView recyclerView;
    private java.util.List<List> example;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forcast);
        ApiService api = RetroClient.getApiService();
        Call<List> call = api.getForcast("london","5","cd3491d1adf0d046b57f42e31dff713e");
     call.enqueue(new Callback<List>() {
         @Override
         public void onResponse(Response<List> response, Retrofit retrofit) {
             if (response.body() != null) {
                 example = (java.util.List<List>) response.body();
                 recyclerView = findViewById(R.id.rv1);
                 adapter = new WeatherAdapter(getApplicationContext(),example);
                 recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                 recyclerView.setAdapter(adapter);
               //  Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();
             }
         }

         @Override
         public void onFailure(Throwable t) {
             recyclerView=findViewById(R.id.rv1);
             adapter=new WeatherAdapter(getApplicationContext());
             recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
             recyclerView.setAdapter(adapter);
           //  Toast.makeText(getApplicationContext(),"la la la",Toast.LENGTH_LONG).show();
         }
     });


    }

}
