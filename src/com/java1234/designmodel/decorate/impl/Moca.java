package com.java1234.designmodel.decorate.impl;

import com.java1234.designmodel.decorate.Beverage;

public class Moca extends CondimentDecorator {

	private Beverage beverage;

	public Moca(Beverage beverage) {
		this.beverage = beverage;
	}

	public double cost() {
		return 5 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Ä¦¿¨";
	}
}
