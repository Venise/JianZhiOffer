package com.offer.question10;

/**
 * 输入的整数二进制表示法中，有多少个1
 *
 */
public class NumberOf1 {
	
	public static void main(String[] args) {
		System.out.print(getNumbersOf1(7));
		System.out.print(getNumberOf1(7));
	}
	
	private static int getNumberOf1(int n){
		int flag = 1;
		int cnt = 0;
		while(flag != 0) {
			if((n & flag) != 0){
				cnt++;
			}
			flag = flag << 1;
		}
		return cnt;
	}
	
	private static int getNumbersOf1(int n){
		int cnt = 0;
		while(n!=0){
			cnt ++;//有多少个1，就有多少个操作
			n = n & (n -1);
		}
		return cnt;
	}
}
