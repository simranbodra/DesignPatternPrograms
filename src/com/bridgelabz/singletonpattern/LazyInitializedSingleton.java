package com.bridgelabz.singletonpattern;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton(){}
	
	public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
            System.out.println("Created");
        }
        return instance;
    }
	
	public static void main(String[] args) {
		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
