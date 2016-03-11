package com.java1234.designmodel.observer;

/**
 * 观察者
 * 
 * @author wangkai
 *
 * @version $Id: Observer.java, v 0.1 2016年3月11日 下午4:00:30 Administrator Exp $
 */
public interface Observer {

	void update(float temp,float humidity,float pressure);
}
