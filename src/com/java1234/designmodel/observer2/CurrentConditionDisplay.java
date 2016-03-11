package com.java1234.designmodel.observer2;

import java.util.Observable;
import java.util.Observer;

import com.java1234.designmodel.observer.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private Observable observable;
	
	private float temperature;
	
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current Conditions:ÎÂ¶È£º" + temperature + ",Êª¶È" + humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
