package com.java1234.designmodel.strategy.impl;

import com.java1234.designmodel.strategy.FlyBehavior;

/**
 * 压根不会飞
 * 
 * 
 * @author wangkai
 *
 * @version $Id: FlyWithNoWay.java, v 0.1 2016年3月11日 上午11:10:36 Administrator Exp $
 */
public class FlyWithNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("不会飞");
	}

}
