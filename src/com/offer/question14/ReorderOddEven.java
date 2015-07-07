package com.offer.question14;

import java.util.ArrayList;

public class ReorderOddEven {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		reorderOddEven1(array);
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
	
	private static int[] reorderOddEven1(int[] array){
		ArrayList<Integer> oddList = new ArrayList<Integer>();//奇数
		ArrayList<Integer> evenList = new ArrayList<Integer>();//偶数
		for(int i=0;i<array.length;i++){
			if((array[i] & 0x1)!=0){//奇数
				oddList.add(array[i]);
			}else{
				evenList.add(array[i]);
			}
		}
		for(int i=0;i<oddList.size();i++){
			array[i]=oddList.get(i);
		}
		for(int i=oddList.size();i<array.length;i++){
			array[i]=evenList.get(i-oddList.size());
		}
		return array;
	} 
}
