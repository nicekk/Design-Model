package com.java1234.designmodel.strategy.impl;

import com.java1234.designmodel.strategy.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("ÕæµÄßÉßÉ½Ð");
	}

}
