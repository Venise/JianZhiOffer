package com.offer.question02;

public class Singleton4 {
	//JLS(Java Language Specification)�ڲ��࣬���贴��
	private Singleton4(){}
	
	public static Singleton4 getInstance(){
		return SingletonHolder.instance;
	}	
	
	static class SingletonHolder{
		public static Singleton4 instance = new Singleton4();
	}
}
