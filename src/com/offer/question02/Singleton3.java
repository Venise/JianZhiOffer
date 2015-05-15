package com.offer.question02;

public class Singleton3 {
	//Ë«ÖØÐ£ÑéËø
	private Singleton3(){}
	private static Singleton3 instance;
	
	public static Singleton3 getInstance(){
		if(instance == null) {
			synchronized(Singleton3.class) {
				if(instance == null)
					instance = new Singleton3();
			}
		}
		return instance;
	}
}
