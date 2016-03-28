package com.java1234.designmodel.singleton;

/**
 * 利用双重加锁机制
 * 首先检查是否实例已经实现了，如果尚未创建，才进行同步，这样一来，只有第一次才会同步
 * volatile 确保，当uniqueSingleton变量初始化城Singleton实例时，多个线程正确处理uniqueSingleton变量
 * 
 * @author wangkai
 *
 * @version $Id: Singleton4.java, v 0.1 2016年3月24日 下午5:01:20 Administrator Exp $
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
