package com.bridgelabz.singletonpattern;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton(){}
	
	public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingleton();
	            }
	        }
	    }
	    return instance;
	}

	
	public static void main(String[] args) {
		ThreadSafeSingleton instnace1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
		System.out.println(instnace1.hashCode());
		System.out.println(instance2.hashCode());
		ThreadSafeSingleton instnace3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		ThreadSafeSingleton instnace4 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(instnace3.hashCode());
		System.out.println(instnace4.hashCode());
	}
}
