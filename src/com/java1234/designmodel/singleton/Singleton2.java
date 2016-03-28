package com.java1234.designmodel.singleton;

/**
 * ����ͬ��������ģʽ
 * �������ַ�ʽ�ܺ����ܣ���Ϊֻ�е�һ�γ�ʼ����ʱ�򣬲Żᵼ��ͬ������
 * 
 * @author wangkai
 *
 * @version $Id: Singleton2.java, v 0.1 2016��3��24�� ����4:56:32 Administrator Exp $
 */
public class Singleton2 {
	
	private static Singleton2 uniqueSingleton;
	
	private Singleton2() {
		
	}
	
	public static synchronized Singleton2 getInstance() {
		if (uniqueSingleton == null) {
			uniqueSingleton = new Singleton2();
		}
		return uniqueSingleton;
	}

}
