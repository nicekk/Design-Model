package com.java1234.designmodel.observer.impl;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditiosDisplay currentDisplay = new CurrentConditiosDisplay(weatherData);
		weatherData.setMeasurements(80, 56, 30);
		weatherData.setMeasurements(90, 35, 98);
	}
}
