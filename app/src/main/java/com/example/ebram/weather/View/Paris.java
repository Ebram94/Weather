package com.example.ebram.weather.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.ebram.weather.Model.API.ApiService;
import com.example.ebram.weather.Model.API.RetroClient;
import com.example.ebram.weather.Model.POJO.Example;
import com.example.ebram.weather.R;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


public class Paris extends Fragment {

    private TextView city,Temp,des,pressure,humidity,wind;
    Button b;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ApiService api = RetroClient.getApiService();
       // Call call = api.getCurWeather("Paris","86765ece6bbc1796dc46c2fb59ead6de");
        Call<Example> call = api.getCurWeather("Paris","cd3491d1adf0d046b57f42e31dff713e");;
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Response<Example> response, Retrofit retrofit) {

                if (response.body() != null) {

                    Example example = (Example) response.body();
                    humidity.setText(example.getMain().getHumidity()+ "%");
                    Temp.setText((int)(example.getMain().getTemp()/10) + "° C");
                    wind.setText(example.getWind().getSpeed() + "M/S");
                    des.setText("" + example.getWeather().get(0).getMain());
                    city.setText("" + example.getName() + "," + example.getSys().getCountry());
                    pressure.setText("" + example.getMain().getPressure() + "hpa");

                 //   Toast.makeText(getContext(), "ana hna", Toast.LENGTH_SHORT).show();

                }
                else{
                 //   Toast.makeText(getContext(), "9lt", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Throwable t) {
               // Toast.makeText(getContext(), "bara 5als", Toast.LENGTH_SHORT).show();
            }
        });



            }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_paris, container, false);
        b=view.findViewById(R.id.btLogin4);
        city=view.findViewById(R.id.tvCity4);
        Temp=view.findViewById(R.id.tvTemp4);
        des=view.findViewById(R.id.tvMain4);
        pressure=view.findViewById(R.id.tvPressure4);
        humidity=view.findViewById(R.id.tvHumidity4);
        wind=view.findViewById(R.id.tvWind4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),Forcast.class);
                startActivity(intent);
            }
        });
        return view ;
    }


}
