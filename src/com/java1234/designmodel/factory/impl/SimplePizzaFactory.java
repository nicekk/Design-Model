package com.java1234.designmodel.factory.impl;

import com.java1234.designmodel.factory.Pizza;

/**
 * 简单pizza工厂
 * 
 * @author wangkai
 *
 * @version $Id: SimplePizzaFactory.java, v 0.1 2016年3月12日 下午2:49:49 Administrator Exp $
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("greek".equals(type)) {
			pizza = new GreekPizza();
		} else {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
