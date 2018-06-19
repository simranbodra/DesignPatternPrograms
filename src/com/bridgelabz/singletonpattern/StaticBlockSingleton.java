package com.bridgelabz.singletonpattern;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton(){}
	
	static{
        try{
            instance = new StaticBlockSingleton();
        }catch(RuntimeException e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
	
	public static StaticBlockSingleton getInstance(){
		System.out.println("instantiated");
        return instance;
    }
	
	public static void main(String[] args) {
		StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
