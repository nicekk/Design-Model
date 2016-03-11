package com.bench.app.duck.impl;

import com.bench.app.duck.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("²»»á½Ð");
	}

}
