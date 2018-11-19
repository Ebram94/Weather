package com.example.ebram.weather.View;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ebram.weather.Adapter.SectionsPagerAdapter;
import com.example.ebram.weather.Adapter.WeatherAdapter;
import com.example.ebram.weather.Model.API.ApiService;
import com.example.ebram.weather.Model.API.RetroClient;
import com.example.ebram.weather.Model.POJO.Example;
import com.example.ebram.weather.Model.POJO.Main;
import com.example.ebram.weather.Model.POJO.Weather;
import com.example.ebram.weather.Model.POJO.Wind;
import com.example.ebram.weather.R;
import com.squareup.okhttp.ResponseBody;

import java.util.ArrayList;
import java.util.List;


import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private String c;

private static  List<Example> exampleList=new ArrayList<>();
    private SwipeRefreshLayout swipeContainer;
    private SharedPreferences sharedpreferences;
    public static final String WeatherData = "weather";
    private SectionsPagerAdapter mSectionsPagerAdapter;
    
    private ViewPager mViewPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        ViewPager mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }
/*
       adapter=new WeatherAdapter(getApplicationContext(),exampleList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    private void getWeatherLondon() {

        ApiService api = RetroClient.getApiService();
        //   sharedpreferences = getSharedPreferences(WeatherData, Context.MODE_PRIVATE);


        Call call = api.getCurWeather("london","fed352ff11063ed2a380232e547d0f46");

        call.enqueue(new Callback() {
            @Override
            public void onResponse(Response response, Retrofit retrofit) {
                if (response.body() != null) {
                    Example example = (Example) response.body();
                  exampleList.add(example);
                    Toast.makeText(getApplicationContext(), "ana hna", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), "9lt", Toast.LENGTH_SHORT).show();

                }

            }


            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    private void getWeatherParise() {

        ApiService api = RetroClient.getApiService();
        //   sharedpreferences = getSharedPreferences(WeatherData, Context.MODE_PRIVATE);


        Call call = api.getCurWeather("Parise","fed352ff11063ed2a380232e547d0f46");

        call.enqueue(new Callback() {
            @Override
            public void onResponse(Response response, Retrofit retrofit) {
                if (response.body() != null) {
                    Example example = (Example) response.body();
                    exampleList.add(example);
                    Toast.makeText(getApplicationContext(), "ana hna", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), "9lt", Toast.LENGTH_SHORT).show();

                }

            }


            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
    private void getWeatherMoscow() {

        ApiService api = RetroClient.getApiService();
        //   sharedpreferences = getSharedPreferences(WeatherData, Context.MODE_PRIVATE);


        Call call = api.getCurWeather("Moscow","fed352ff11063ed2a380232e547d0f46");

        call.enqueue(new Callback() {
            @Override
            public void onResponse(Response response, Retrofit retrofit) {
                if (response.body() != null) {
                    Example example = (Example) response.body();
                    exampleList.add(example);
                    Toast.makeText(getApplicationContext(), "ana hna", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), "9lt", Toast.LENGTH_SHORT).show();

                }

            }


            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
    private void getWeatherRoma() {

        ApiService api = RetroClient.getApiService();
        //   sharedpreferences = getSharedPreferences(WeatherData, Context.MODE_PRIVATE);


        Call call = api.getCurWeather("Rome","fed352ff11063ed2a380232e547d0f46");

        call.enqueue(new Callback() {
            @Override
            public void onResponse(Response response, Retrofit retrofit) {
                if (response.body() != null) {
                    Example example = (Example) response.body();
                    exampleList.add(example);
                    Toast.makeText(getApplicationContext(), "ana hna", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), "9lt", Toast.LENGTH_SHORT).show();

                }

            }


            @Override
            public void onFailure(Throwable t) {

            }
        });
    }*/

}















    /*    */



    /*  swipeContainer = (SwipeRefreshLayout) findViewById(R.id.main_content);
        swipeContainer.setColorSchemeResources(android.R.color.holo_orange_dark);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getWeather();
                Toast.makeText(MainActivity.this, "Weather Updated", Toast.LENGTH_SHORT).show();
            }
        });*/







