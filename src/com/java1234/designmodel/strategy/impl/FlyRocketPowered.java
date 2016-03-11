package com.java1234.designmodel.strategy.impl;

import com.java1234.designmodel.strategy.FlyBehavior;

/**
 * �û����
 * 
 * @author wangkai
 *
 * @version $Id: FlyRocketPowered.java, v 0.1 2016��3��11�� ����11:10:46 Administrator Exp $
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("�û����");
	}

}
