package com.springtesting.javatesting.services;

import org.springframework.stereotype.Service;

import com.springtesting.javatesting.models.Weather;

@Service
public class WeatherService {
	
	public Weather getWeather() {
		Weather weather = new Weather();
		weather.setMaxTemp(10.5);
		weather.setMinTemp(2.4);
		weather.setStatus("Cloudy");
		return weather;
	}

}
