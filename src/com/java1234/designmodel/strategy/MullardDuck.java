package com.java1234.designmodel.strategy;

import com.java1234.designmodel.strategy.impl.FlyWithWings;
import com.java1234.designmodel.strategy.impl.Quack;

public class MullardDuck extends Duck {

	public MullardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("ÂÌÍ·Ñ¼");
	}
	
	public static void main(String[] args) {
		Duck mallard = new MullardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
	}
}
