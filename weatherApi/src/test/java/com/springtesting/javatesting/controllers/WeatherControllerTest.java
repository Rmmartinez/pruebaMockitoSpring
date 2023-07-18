package com.springtesting.javatesting.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springtesting.javatesting.models.Weather;
import com.springtesting.javatesting.services.WeatherService;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

	@InjectMocks
	private WeatherController controller;
	
	@Mock
	private WeatherService service;
	
	@Test
	public void getWeather() {
		Weather weatherMock = new Weather();
		weatherMock.setMaxTemp(30.2);
		weatherMock.setMinTemp(21.0);
		weatherMock.setStatus("Sunny");
		when(service.getWeather()).thenReturn(weatherMock);
		
		Weather result = controller.getWeather();
		
		//se verifica que se llama a getWeather al menos una vez
		verify(service, times(1)).getWeather();
		
	}
}
