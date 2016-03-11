package com.bench.app.duck;

/**
 * 1.��ԭʼ����
 * ��ǰ���������ڸ���Ѽ���ж���Ѽ�ӵ���Ϊ���þ����Ѽ��ȥ�̳��������Ѽ�ӣ��Ӷ��������ø������Ϊ��
 * ���������µ�Ѽ�����µ���Ϊʱ�����ڸ���Ѽ���м�һ����Ϊ���ͻᵼ����������Ѽ�Ӷ�����������Ϊ��
 * 2.�Ľ�����
 * ��һ�����еĽӿڣ����еľ���Ѽ�Ӷ�ʵ������ӿڣ����ǵ�����Ѽ�Ӷ��˵�ʱ�򣬻ᵼ�´������ظ����롣
 * ����ÿ����Ϊ�仯��ʱ�򣬾���Ѽ�ӵĶ����ܵ�ǣ��
 * 3.�����ģʽ
 * �ѷ��кͽе������Ϊ�;����Ѽ�ӷֿ�������Ӧ���п�����Ҫ�仯�ĵط�����������������Щ����Ҫ�仯�Ĳ��ֻ���һ�𣩣�
 * ���ǰ���Ϊ��һ�����õ�����һ�׻���ʵ�֡�Ȼ������Ѽ�����������Ϊ�Ϳ����ˡ�
 * ÿ�������µ���Ϊ��ֻҪ�Ķ�������Ϊ�Ĵ��뼴��
 * 
 * @author wangkai
 *
 * @version $Id: Duck.java, v 0.1 2016��3��11�� ����11:03:21 Administrator Exp $
 */
public abstract class Duck {

	protected FlyBehavior flyBehavior;
	
	protected QuackBehavior quackBehavior;
	
	/**
	 * ��FlyBehavior��Ϊ���������������ȥ����Ѽ�ӵ���Ϊ
	 */
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public abstract void display();
	
	/**
	 * ���������ȥ����Ѽ�ӵĲ�ͬ��Ϊ
	 * ����������ʱ����̬���ò�ͬ����Ϊ
	 * @param behavior
	 */
	public void setFlyBehavior(FlyBehavior behavior) {
		this.flyBehavior = behavior;
	}
	
	public void setQuackBehavior(QuackBehavior behavior) {
		this.quackBehavior = behavior;
	}
}
