package com.java1234.designmodel.observer2;

import java.util.Observable;

/**
 * ����վ
 * 
 * @author wangkai
 *
 * @version $Id: WeatherData.java, v 0.1 2016��3��11�� ����4:42:11 Administrator Exp $
 */
public class WeatherData extends Observable {

	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherData() {
		
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
