package com.java1234.designmodel.observer;


/**
 * 主题
 * 可以通知观察者
 * 
 * @author wangkai
 *
 * @version $Id: Subject.java, v 0.1 2016年3月11日 下午3:59:15 Administrator Exp $
 */
public interface Subject {

	/**
	 * 注册观察者
	 */
	void registerObserver(Observer o);
	
	/**
	 * 移除观察者
	 */
	void removeObserver(Observer o);
	
	/**
	 * 通知观察者
	 */
	void notifyObservers();
	
}
