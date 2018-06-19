package com.bridgelabz.singletonpattern;

public enum EnumSingleton1 {

	INSTANCE;
	
	public static void doSomething(){
        System.out.println("instnace created");
    }
	
	public static void main(String[] args) {
		System.out.println("Enum Singleton");
		System.out.println(EnumSingleton1.INSTANCE.hashCode());
		System.out.println(EnumSingleton1.INSTANCE.hashCode());
	}
}
