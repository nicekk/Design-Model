package com.java1234.designmodel.observer2;

import java.util.Observer;

public class Starter {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		Observer observer = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(13, 55, 88);
	}
}
