package com.bridgelabz.singletonpattern;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton(){}
	
	public static EagerInitializedSingleton getInstance(){
		System.out.println("created");
        return instance;
    }
	
	public static void main(String[] args) {
		
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instnace2 = EagerInitializedSingleton.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instnace2.hashCode());
		
	}
}
