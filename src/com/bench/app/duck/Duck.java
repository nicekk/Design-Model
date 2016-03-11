package com.bench.app.duck;

/**
 * 1.最原始做法
 * 以前的做法是在父类鸭子中定义鸭子的行为，让具体的鸭子去继承这个父类鸭子，从而让子类获得父类的行为。
 * 但是遇到新的鸭子有新的行为时，再在父类鸭子中加一个行为，就会导致所有子类鸭子都具有这种行为。
 * 2.改进做法
 * 用一个飞行的接口，所有的具体鸭子都实现这个接口，但是当具体鸭子多了的时候，会导致大量的重复代码。
 * 而且每当行为变化的时候，具体鸭子的都会受到牵连
 * 3.用设计模式
 * 把飞行和叫的这个行为和具体的鸭子分开，（把应用中可能需要变化的地方独立出来，不和那些不需要变化的部分混在一起）；
 * 就是把行为这一部分用单独的一套机制实现。然后所有鸭子引用这个行为就可以了。
 * 每当出现新的行为，只要改动这套行为的代码即可
 * 
 * @author wangkai
 *
 * @version $Id: Duck.java, v 0.1 2016年3月11日 上午11:03:21 Administrator Exp $
 */
public abstract class Duck {

	protected FlyBehavior flyBehavior;
	
	protected QuackBehavior quackBehavior;
	
	/**
	 * 把FlyBehavior作为变量，用这个方法去描述鸭子的行为
	 */
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public abstract void display();
	
	/**
	 * 用这个方法去描述鸭子的不同行为
	 * 可以在运行时，动态设置不同的行为
	 * @param behavior
	 */
	public void setFlyBehavior(FlyBehavior behavior) {
		this.flyBehavior = behavior;
	}
	
	public void setQuackBehavior(QuackBehavior behavior) {
		this.quackBehavior = behavior;
	}
}
