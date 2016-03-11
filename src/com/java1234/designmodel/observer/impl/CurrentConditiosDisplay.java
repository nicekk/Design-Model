package com.java1234.designmodel.observer.impl;

import com.java1234.designmodel.observer.DisplayElement;
import com.java1234.designmodel.observer.Observer;
import com.java1234.designmodel.observer.Subject;

/**
 * �۲���ʵ�֣�
 * �۲���ӵ��һ����������ã�����������ע�ᣬʹ�Լ���Ϊ�۲��ߣ��յ���Ϣ�䶯ʹ��
 * 
 * @author wangkai
 *
 * @version $Id: CurrentConditiosDisplay.java, v 0.1 2016��3��11�� ����5:07:56 Administrator Exp $
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
		System.out.println("Current Conditions:�¶ȣ�" + temprature + ",ʪ��" + humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temprature = temp;
		this.humidity = humidity;
		display();
	}
}
