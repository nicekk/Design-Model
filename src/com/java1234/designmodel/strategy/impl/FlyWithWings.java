package com.java1234.designmodel.strategy.impl;

import com.java1234.designmodel.strategy.FlyBehavior;

/**
 * �ó��ɡ�ʵ���˷�����Ϊ
 * 
 * @author wangkai
 *
 * @version $Id: FlyWithWings.java, v 0.1 2016��3��11�� ����11:10:17 Administrator Exp $
 */
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("�ó���");
	}

}
