package com.java1234.designmodel.decorate;

public abstract class Beverage {

	protected String description = "Unknow beverage";

	protected int size;
	
	/**
	 * 获得描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 花费
	 */
	public abstract double cost();

	public double extraCost() {
		if (size == 0) {
			return 0.1;
		} else if(size == 1) {
			return 0.15;
		} else {
			return 0.2;
		}
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
