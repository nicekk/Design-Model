package com.java1234.designmodel.factory;


public abstract class PizzaStore {

	/**
	 * ��������
	 * @param type
	 * @return
	 */
	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	/**
	 * ��������
	 * @param type
	 * @return
	 */
	public abstract  Pizza createPizza(String type);

}
