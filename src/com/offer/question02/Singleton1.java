package com.offer.question02;

public class Singleton1 {
	//����ʽ
	private Singleton1(){}
	private static Singleton1 instance = new Singleton1();
	public static Singleton1 getInstance(){
		return instance;
	}
}
