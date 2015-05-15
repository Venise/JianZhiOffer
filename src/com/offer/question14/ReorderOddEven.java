package com.offer.question14;

public class ReorderOddEven {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		reorderOddEven(array);
		if(!(array == null)){
			for(int i=0; i<array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	}
	
	private static int[] reorderOddEven(int[] array){
		if(array == null || array.length == 0) return null;
		int leftPtr = -1;
		int rightPtr = array.length;
		while(true) {
			//向后移动指针，直到指向偶数
			//(array[++leftPtr] & 0x1) != 0判断是否为奇数
			while(leftPtr < array.length-1 && (array[++leftPtr] & 0x1) != 0);
			//向前移动指针，直到指向奇数
			//(array[++leftPtr] & 0x1) == 0判断是否为偶数
			while(rightPtr > 0 && (array[--rightPtr] & 0x1) == 0);
			if(leftPtr >= rightPtr) break;
			else {
				//交换
				int temp = array[leftPtr];
				array[leftPtr] = array[rightPtr];
				array[rightPtr] = temp;
			}
		}
		return array;
	} 
}
