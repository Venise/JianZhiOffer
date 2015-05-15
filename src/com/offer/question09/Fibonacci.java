package com.offer.question09;


/**
 * f(n) = 0, n=0
 * f(n) = 2, n=1
 * f(n) = f(n-1) + f(n-2), n>1
 * ���㣺�ݹ� ���ݹ��Ч��Ϊʲô���¡� �����ѭ���ķ�ʽ����ݹ�Ч�ʵ͵�����
 *
 */
public class Fibonacci {
	
	public static void main(String[] args){
		System.out.println(fibonacci(1));
		System.out.println(fibonacciRec(8));
	}
	
	//���õݹ�ķ�ʽ
	private static long fibonacciRec(int n){
		if(n < 0) return -1;
		if(n == 0) return 0;
		else if (n == 1) return 2;
		else return (fibonacciRec(n-1) + fibonacciRec(n-2));
	}
	
	//����ѭ���ķ�ʽ
	private static long fibonacci(int n){
		if(n < 0) return -1;
		if(n == 0) return 0;
		if (n == 1) return 2;
		long fibonacciFirst = 2;
		long fibonacciSecond = 0;
		long result = 0;
		int cnt = 2;
		while(cnt <= n) {
			result = fibonacciFirst + fibonacciSecond;
			fibonacciSecond = fibonacciFirst;
			fibonacciFirst = result;
			cnt++;
		}
		return result;
	}
}
