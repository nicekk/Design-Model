package com.java1234.designmodel.factory;

/**
 * pisa
 * 
 * @author wangkai
 *
 * @version $Id: Pizza.java, v 0.1 2016年3月12日 下午2:42:33 Administrator Exp $
 */
public interface Pizza {

	/**
	 * 准备
	 */
	public void prepare();

	/**
	 * 烘焙
	 */
	public void bake();

	/**
	 * 切片
	 */
	public void cut();

	/**
	 * 装箱
	 */
	public void box();

}
