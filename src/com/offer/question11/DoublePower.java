package com.offer.question11;

/**
 * 不用系统函数，实现数值的整数次方
 */
public class DoublePower {
	
	static boolean isInvalidInput = false;
	
	public static void main(String[] args) {
		System.out.printf("%.8f", doPower2(1.2, 6));
		System.out.println();
		System.out.println(doPower2(1.2, 6));
		System.out.println(doPower(2, 4));
	}
	
	//要考虑指数为0和负数的情况
	private static double doPower(double base, int exponent){
		isInvalidInput = false;
		if(equals(base, 0.0) && exponent < 0) {
			isInvalidInput = true;
			return 0.0;
		}
		int absExponent = (int) exponent;
		if(exponent < 0)
			absExponent = (int) (-exponent);
		double result = powerWithExponent(base, absExponent);
		if(exponent < 0)
			result = 1.0/result;
		return result;
	}
	
	private static double powerWithExponent(double base, int absExponent) {
		double result = 1.0;
		for(int i=0; i<absExponent; i++)
			result *= base;
		return result;
	}

	private static boolean equals(double num1, double num2){
		if((num1 - num2 < 0.0000001) || (num1 - num2 > -0.0000001))
				return true;
		else 
			return false;
	}
	
	private static double doPower2(double base, int exponent){
		if(exponent == 0) return 1;
		if(exponent == 1) return base;
		double result = doPower2(base, exponent>>1);//exponent>>1为exponent/2
		result *= result;
		if((exponent & 0x1) == 1)//为奇数
			result *= base;
		return result;
	}
}
