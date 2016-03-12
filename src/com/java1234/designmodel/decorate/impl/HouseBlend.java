package com.java1234.designmodel.decorate.impl;

import com.java1234.designmodel.decorate.Beverage;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	@Override
	public double cost() {
		return 0.89;
	}

}
