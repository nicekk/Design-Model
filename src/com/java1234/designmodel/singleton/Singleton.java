package com.java1234.designmodel.singleton;

/**
 * 这种代码可能会导致多线程问题
 * 
 * @author wangkai
 *
 * @version $Id: Singleton.java, v 0.1 2016年3月24日 下午4:56:18 Administrator Exp $
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
