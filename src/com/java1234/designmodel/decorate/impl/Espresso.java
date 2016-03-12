package com.java1234.designmodel.decorate.impl;

import com.java1234.designmodel.decorate.Beverage;

public class Espresso extends Beverage {

	@Override
	public double cost() {
		return 1.99;
	}

	@Override
	public String getDescription() {
		return "espresso";
	}

}
