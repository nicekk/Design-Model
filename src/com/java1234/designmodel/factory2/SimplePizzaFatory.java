package com.java1234.designmodel.factory2;

import com.java1234.designmodel.factory2.impl.CheesePizza;
import com.java1234.designmodel.factory2.impl.GreekPizza;
import com.java1234.designmodel.factory2.impl.PepperoniPizza;

public class SimplePizzaFatory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} 
		return pizza;
	}
}
