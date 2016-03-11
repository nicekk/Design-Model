package com.java1234.designmodel.observer;


/**
 * ����
 * ����֪ͨ�۲���
 * 
 * @author wangkai
 *
 * @version $Id: Subject.java, v 0.1 2016��3��11�� ����3:59:15 Administrator Exp $
 */
public interface Subject {

	/**
	 * ע��۲���
	 */
	void registerObserver(Observer o);
	
	/**
	 * �Ƴ��۲���
	 */
	void removeObserver(Observer o);
	
	/**
	 * ֪ͨ�۲���
	 */
	void notifyObservers();
	
}
