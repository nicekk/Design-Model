package com.java1234.designmodel.singleton;

/**
 * 急切创建实例
 * 
 * @author wangkai
 *
 * @version $Id: Singleton3.java, v 0.1 2016年3月24日 下午4:59:44 Administrator Exp $
 */
public class Singleton3 {

	private static Singleton3 uniqueSingleton = new Singleton3();
	
	private Singleton3() {
		
	}
	public static Singleton3 getInstance() {
		return uniqueSingleton;
	}
}
