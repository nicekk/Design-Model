package com.java1234.designmodel.singleton;

/**
 * 利用同步代码块的模式
 * 但是这种方式很耗性能，因为只有第一次初始化的时候，才会导致同步问题
 * 
 * @author wangkai
 *
 * @version $Id: Singleton2.java, v 0.1 2016年3月24日 下午4:56:32 Administrator Exp $
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
