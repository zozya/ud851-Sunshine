package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private final String  WEATHER_STRING = "weather";
    TextView mDisplayWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mDisplayWeather = (TextView) findViewById(R.id.display_weather);

        // DONE (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String weatherForecast = "";
        if(bundle != null && bundle.containsKey(WEATHER_STRING)) {
            weatherForecast = (String) bundle.get(WEATHER_STRING);
        }
        mDisplayWeather.setText(weatherForecast);
    }
}