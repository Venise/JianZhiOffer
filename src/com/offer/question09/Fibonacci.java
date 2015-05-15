package com.offer.question09;


/**
 * f(n) = 0, n=0
 * f(n) = 2, n=1
 * f(n) = f(n-1) + f(n-2), n>1
 * 考点：递归 、递归的效率为什么低下、 如何用循环的方式避免递归效率低的问题
 *
 */
public class Fibonacci {
	
	public static void main(String[] args){
		System.out.println(fibonacci(1));
		System.out.println(fibonacciRec(8));
	}
	
	//采用递归的方式
	private static long fibonacciRec(int n){
		if(n < 0) return -1;
		if(n == 0) return 0;
		else if (n == 1) return 2;
		else return (fibonacciRec(n-1) + fibonacciRec(n-2));
	}
	
	//采用循环的方式
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
