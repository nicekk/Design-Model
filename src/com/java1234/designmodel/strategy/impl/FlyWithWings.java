package com.java1234.designmodel.strategy.impl;

import com.java1234.designmodel.strategy.FlyBehavior;

/**
 * 用翅膀飞。实现了飞行行为
 * 
 * @author wangkai
 *
 * @version $Id: FlyWithWings.java, v 0.1 2016年3月11日 上午11:10:17 Administrator Exp $
 */
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("用翅膀飞");
	}

}
