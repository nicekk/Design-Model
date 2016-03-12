package com.java1234.designmodel.decorate.impl;

import com.java1234.designmodel.decorate.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast (int size) {
		this.size = size;
	}
	
	public double cost() {
		System.out.println("…Ó±∫øß∑»£∫" + 2);
		return 2 + extraCost();
	}

	@Override
	public String getDescription() {
		return "…Ó±∫øß∑»";
	}
}
