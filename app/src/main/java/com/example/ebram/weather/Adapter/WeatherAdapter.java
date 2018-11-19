package com.example.ebram.weather.Adapter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ebram.weather.Model.POJO.Example;
import com.example.ebram.weather.Model.POJO.Main;
import com.example.ebram.weather.Model.POJO.Weather;
import com.example.ebram.weather.Model.POJO.Wind;
import com.example.ebram.weather.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>{
    private Context context;
    private List<com.example.ebram.weather.Model.POJO.List> example;
    private LayoutInflater layoutInflater;

    public WeatherAdapter(Context context) {
        this.context = context;
        layoutInflater=LayoutInflater.from(context);
    }

    public WeatherAdapter(Context context, java.util.List<com.example.ebram.weather.Model.POJO.List> example) {
        this.context = context;
        this.example = example;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public  WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.row,parent,false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final WeatherViewHolder holder, int position) {

/*             holder.hum.setText(""+example.get(position).getMain().getHumidity());
             holder.temp.setText(example.get(position).getMain().getTemp()+"° C");
             holder.wind.setText(example.get(position).getWind().getSpeed()+"%");
             holder.main.setText(""+example.get(0).getWeather().get(0).getMain());
             holder.Pre.setText(example.get(position).getMain().getPressure()+"pha");
             holder.rain.setText(example.get(position).getRain().get3h()+"H");
             holder.date.setText(example.get(position).getDtTxt());*/



    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder
    {
        private TextView city,temp,main,wind,hum,rain,Pre,date;
        private ImageView image;

        public WeatherViewHolder(View itemView) {
            super(itemView);
           city=itemView.findViewById(R.id.tvC);
            temp=itemView.findViewById(R.id.tvtem);
            main=itemView.findViewById(R.id.tvdes);
            hum=itemView.findViewById(R.id.tvh);
            wind=itemView.findViewById(R.id.tvW);
            rain=itemView.findViewById(R.id.tvR);
            Pre=itemView.findViewById(R.id.tvP);
            date=itemView.findViewById(R.id.tvdate);


        }
    }
}



