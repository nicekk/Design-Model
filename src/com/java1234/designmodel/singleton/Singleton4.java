package com.java1234.designmodel.singleton;

/**
 * ����˫�ؼ�������
 * ���ȼ���Ƿ�ʵ���Ѿ�ʵ���ˣ������δ�������Ž���ͬ��������һ����ֻ�е�һ�βŻ�ͬ��
 * volatile ȷ������uniqueSingleton������ʼ����Singletonʵ��ʱ������߳���ȷ����uniqueSingleton����
 * 
 * @author wangkai
 *
 * @version $Id: Singleton4.java, v 0.1 2016��3��24�� ����5:01:20 Administrator Exp $
 */
public class Singleton4 {

	private volatile static Singleton4 uniqueSingleton;
	
	private Singleton4() {
		
	}
	
	public static Singleton4 getInstance() {
		if (uniqueSingleton == null) {
			synchronized (Singleton4.class) {
				if (uniqueSingleton == null) {
					uniqueSingleton = new Singleton4();
				}
			}
		}
		return uniqueSingleton;
	}
}
