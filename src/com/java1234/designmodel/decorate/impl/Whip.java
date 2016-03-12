package com.java1234.designmodel.decorate.impl;

import com.java1234.designmodel.decorate.Beverage;

public class Whip extends CondimentDecorator{

	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ",whip";
	}

	@Override
	public double cost() {
		return 2.5 + beverage.cost();
	}

}
