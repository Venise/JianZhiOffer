package com.offer.question12;

public class PrintToMaxOfNDigits {

	public static void main(String[] args) {
		print1(3);
	}
	
	//0-9的所有数字进行全排列,最高位为0的数不打印0,递归
	private static void print1(int n){
		if(n<=0) return;
		char[] number = new char[n];//存放数字的字符
		for(int i=0; i<10; i++){
			number[0] = (char) (i + '0');//为什么要(i + '0')? 比如'9'-'0'=9;两者字符的ASCII码间隔为9，则'9'= 9+'0';
			printRec(number, n, 0);
		}
	}
	
	private static void printRec(char[] number, int length, int index) {
		if(index == length-1){
			printNumber(number);
			return;
		}
		for(int i=0; i<10; i++){
			number[index+1] = (char) (i + '0');
			printRec(number, length, index+1);
		}
	}

	private static void printNumber(char[] number) {
		boolean isBeginWith0 = true;
		int length = number.length;
		for(int i=0; i<length; i++){
			if(isBeginWith0 && number[i] != '0')
			//000098，最后打印出来为98;直到遇到第一个非0的字符，isBeginWith0才设置为false
				isBeginWith0 = false;
			if(!isBeginWith0)
				System.out.print(number[i]);
		}
		System.out.println();
	}

	//要考虑大数情况
	@SuppressWarnings("unused")
	private static void print(int n){
		
	}
}

