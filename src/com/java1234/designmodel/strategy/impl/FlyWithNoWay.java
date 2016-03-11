package com.java1234.designmodel.strategy.impl;

import com.java1234.designmodel.strategy.FlyBehavior;

/**
 * ѹ�������
 * 
 * 
 * @author wangkai
 *
 * @version $Id: FlyWithNoWay.java, v 0.1 2016��3��11�� ����11:10:36 Administrator Exp $
 */
public class FlyWithNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("�����");
	}

}
