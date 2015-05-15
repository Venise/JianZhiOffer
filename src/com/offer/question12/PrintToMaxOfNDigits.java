package com.offer.question12;

public class PrintToMaxOfNDigits {

	public static void main(String[] args) {
		print1(3);
	}
	
	//0-9���������ֽ���ȫ����,���λΪ0��������ӡ0,�ݹ�
	private static void print1(int n){
		if(n<=0) return;
		char[] number = new char[n];//������ֵ��ַ�
		for(int i=0; i<10; i++){
			number[0] = (char) (i + '0');//ΪʲôҪ(i + '0')? ����'9'-'0'=9;�����ַ���ASCII����Ϊ9����'9'= 9+'0';
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
			//000098������ӡ����Ϊ98;ֱ��������һ����0���ַ���isBeginWith0������Ϊfalse
				isBeginWith0 = false;
			if(!isBeginWith0)
				System.out.print(number[i]);
		}
		System.out.println();
	}

	//Ҫ���Ǵ������
	@SuppressWarnings("unused")
	private static void print(int n){
		
	}
}

