package com.bench.app.duck;

import com.bench.app.duck.impl.FlyRocketPowered;
import com.bench.app.duck.impl.FlyWithNoWay;
import com.bench.app.duck.impl.Quack;

/**
 * 模型鸭子。
 * 具有不同的外观，并且不会飞
 * 也可以用火箭驱动它飞
 * 
 * @author wangkai
 *
 * @version $Id: ModelDuck.java, v 0.1 2016年3月11日 上午11:12:30 Administrator Exp $
 */
public class ModelDuck extends Duck{

	@Override
	public void display() {
		System.out.println("这是一个模型鸭子");
	}

	public ModelDuck() {
		flyBehavior = new FlyWithNoWay();
		quackBehavior = new Quack();
	}
	
	public static void main(String[] args) {
		System.out.println("改造前");
		Duck duck = new ModelDuck();
		duck.performFly();
		duck.performQuack();
		
		System.out.println("改造后----------------");
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
}
