package com.offer.question41;

import java.util.ArrayList;

public class FindNumbersWithSum {

	public static void main(String[] args) {

	}
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        //定义两个指针
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(array==null || array.length<=0)
            return list;
        int leftPtr = 0;
        int rightPtr = array.length-1;
        int min = array[array.length - 1] * array[array.length - 2];
        while(leftPtr<rightPtr){
            int currentSum = array[leftPtr]+array[rightPtr];
            if(currentSum==sum){
                int temp = array[leftPtr]*array[rightPtr];
                if(min>temp){
                    min = temp;
					if(list.size()!=0){
                        list.remove(0);
                        list.remove(1);
                    }
                    list.add(array[leftPtr]);
                    list.add(array[rightPtr]);
                }
                leftPtr++;
            }else{
                if(currentSum>sum){
                	rightPtr--;
                }else{
                    leftPtr++;
                }
            }
        }
        return list;
    }

}
