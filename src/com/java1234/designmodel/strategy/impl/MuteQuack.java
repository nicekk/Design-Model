package com.java1234.designmodel.strategy.impl;

import com.java1234.designmodel.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("²»»á½Ð");
	}

}
