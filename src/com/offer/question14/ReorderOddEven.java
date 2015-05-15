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
			//����ƶ�ָ�룬ֱ��ָ��ż��
			//(array[++leftPtr] & 0x1) != 0�ж��Ƿ�Ϊ����
			while(leftPtr < array.length-1 && (array[++leftPtr] & 0x1) != 0);
			//��ǰ�ƶ�ָ�룬ֱ��ָ������
			//(array[++leftPtr] & 0x1) == 0�ж��Ƿ�Ϊż��
			while(rightPtr > 0 && (array[--rightPtr] & 0x1) == 0);
			if(leftPtr >= rightPtr) break;
			else {
				//����
				int temp = array[leftPtr];
				array[leftPtr] = array[rightPtr];
				array[rightPtr] = temp;
			}
		}
		return array;
	} 
}
