package com.java1234.designmodel.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.java1234.designmodel.observer.Observer;
import com.java1234.designmodel.observer.Subject;

/**
 * 主题的实现。
 * 如果有数据变化，及时推送给观察者
 * 
 * @author wangkai
 *
 * @version $Id: WeatherData.java, v 0.1 2016年3月11日 下午5:07:21 Administrator Exp $
 */
public class WeatherData implements Subject {

	private List<Observer> observerList;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherData() {
		observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperatur,float humity,float presure) {
		this.temperature = temperatur;
		this.humidity = humity;
		this.pressure = presure;
		measurementsChanged();
	}
}
