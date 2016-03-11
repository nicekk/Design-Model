package com.bench.app.duck;

import com.bench.app.duck.impl.FlyRocketPowered;
import com.bench.app.duck.impl.FlyWithNoWay;
import com.bench.app.duck.impl.Quack;

/**
 * ģ��Ѽ�ӡ�
 * ���в�ͬ����ۣ����Ҳ����
 * Ҳ�����û����������
 * 
 * @author wangkai
 *
 * @version $Id: ModelDuck.java, v 0.1 2016��3��11�� ����11:12:30 Administrator Exp $
 */
public class ModelDuck extends Duck{

	@Override
	public void display() {
		System.out.println("����һ��ģ��Ѽ��");
	}

	public ModelDuck() {
		flyBehavior = new FlyWithNoWay();
		quackBehavior = new Quack();
	}
	
	public static void main(String[] args) {
		System.out.println("����ǰ");
		Duck duck = new ModelDuck();
		duck.performFly();
		duck.performQuack();
		
		System.out.println("�����----------------");
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
}
