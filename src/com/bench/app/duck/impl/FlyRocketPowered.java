package com.bench.app.duck.impl;

import com.bench.app.duck.FlyBehavior;

/**
 * 用火箭飞
 * 
 * @author wangkai
 *
 * @version $Id: FlyRocketPowered.java, v 0.1 2016年3月11日 上午11:10:46 Administrator Exp $
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("用火箭飞");
	}

}
