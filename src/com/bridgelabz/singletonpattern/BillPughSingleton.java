package com.bridgelabz.singletonpattern;

public class BillPughSingleton {

	private BillPughSingleton(){}
	
	private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
	
	public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
	
	public static void main(String[] args) {
		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = BillPughSingleton.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
