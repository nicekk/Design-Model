package com.java1234.designmodel.decorate;

import com.java1234.designmodel.decorate.impl.DarkRoast;
import com.java1234.designmodel.decorate.impl.Espresso;
import com.java1234.designmodel.decorate.impl.Moca;
import com.java1234.designmodel.decorate.impl.Whip;


public class Buyer {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription());
		
		Beverage beverage2 = new DarkRoast(2);
		Beverage beverage3 = new Moca(beverage2);
		Beverage beverage4 = new Moca(beverage3);
		Beverage beverage5 = new Whip(beverage4);
		
		System.out.println(beverage5.getDescription() + "$" + beverage5.cost());
	}
}
