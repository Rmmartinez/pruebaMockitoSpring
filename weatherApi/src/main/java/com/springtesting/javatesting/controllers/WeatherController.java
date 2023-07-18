package com.springtesting.javatesting.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.springtesting.javatesting.models.Weather;
import com.springtesting.javatesting.services.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class WeatherController {
	
	@Autowired
	private WeatherService service;

	@GetMapping("/api/weather")
	public Weather getWeather() {
		return service.getWeather();
	}
}
