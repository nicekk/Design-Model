package com.java1234.designmodel.observer.impl;

import com.java1234.designmodel.observer.DisplayElement;
import com.java1234.designmodel.observer.Observer;
import com.java1234.designmodel.observer.Subject;

/**
 * 观察者实现，
 * 观察者拥有一份主题的引用，用来像主题注册，使自己成为观察者，收到消息变动痛着
 * 
 * @author wangkai
 *
 * @version $Id: CurrentConditiosDisplay.java, v 0.1 2016年3月11日 下午5:07:56 Administrator Exp $
 */
public class CurrentConditiosDisplay implements Observer, DisplayElement {

	private float temprature;
	
	private float humidity;
	
	private Subject weatherData;
	
	public CurrentConditiosDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current Conditions:温度：" + temprature + ",湿度" + humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temprature = temp;
		this.humidity = humidity;
		display();
	}
}
