package com.offer.question02;

public class Singleton2 {
	//¿¡∫∫ Ω
	private Singleton2(){}
	private static Singleton2 instance;
	
	public static Singleton2 getInstance(){
		if(instance == null)
			instance = new Singleton2();
		return instance;
	}	
}
