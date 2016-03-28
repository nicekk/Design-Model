package com.java1234.designmodel.singleton;

/**
 * ���ִ�����ܻᵼ�¶��߳�����
 * 
 * @author wangkai
 *
 * @version $Id: Singleton.java, v 0.1 2016��3��24�� ����4:56:18 Administrator Exp $
 */
public class Singleton {

	private static Singleton uniqueSingleton;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (uniqueSingleton == null) {
			uniqueSingleton = new Singleton();
		}
		return uniqueSingleton;
	}

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
	}
}
