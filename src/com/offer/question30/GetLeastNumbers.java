package com.offer.question30;

import java.util.ArrayList;

public class GetLeastNumbers {

	
	public static void main(String[] args) {
		

	}

	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	//1�����Ž�������
        //2����ӡ������ǰK������
		ArrayList<Integer> list = new ArrayList<Integer>();
        if(input==null || k<=0 || k>input.length)
            return list;
        quickSortRec(0, input.length-1, input);
        for(int i=0; i<k; i++)
            list.add(input[i]);
        return list;
    }
    
    public void quickSortRec(int left, int right, int[] array){
        if(left>=right)
            return;
        else{
            int pivot = array[right];
            int partition = partionIt(left, right, pivot, array);
            if(partition > left)
            	quickSortRec(left, partition-1, array);//�ݹ�ǰһ���֣�����
			if(partition < right)
				quickSortRec(partition+1, right, array);//�ݹ��һ���֣�����
        }
    }
    
    public int partionIt(int left, int right, int pivot, int[] array){
        int leftPtr = left-1;
        int rightPtr = right;
        while(true){
            while(array[++leftPtr]<pivot);
            while(rightPtr>0 && array[--rightPtr]>pivot);
            if(leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr, array);
        }
        swap(leftPtr, right, array);
        return leftPtr;
    }
    
    public void swap(int left, int right, int[] array){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
