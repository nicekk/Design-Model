package com.bench.app.duck;

import com.bench.app.duck.impl.FlyWithWings;
import com.bench.app.duck.impl.Quack;

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
