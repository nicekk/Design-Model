package com.java1234.designmodel.adaptor;

public class DuckTest {

	public static void main(String[] args) {
		MullardDuck duck = new MullardDuck();

		WildTurkey turkey = new WildTurkey();

		System.out.println("The Turkey says...");

		turkey.gobble();
		turkey.fly();

		System.out.println("The Duck says");
		duck.quack();
		duck.fly();

		Duck turkeyAdaptor = new TurkeyAdaptor(turkey);
		System.out.println("Adaptor says...");
		turkeyAdaptor.quack();
		turkeyAdaptor.fly();
	}
}
