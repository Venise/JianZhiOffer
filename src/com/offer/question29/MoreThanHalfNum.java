package com.offer.question29;

public class MoreThanHalfNum {

	private static int[] array = {1,2,3,2,2,2,5,4,2};
	
	public static void main(String[] args) {
		
		System.out.print(MoreThanHalfNum_Solution());
	}
	
	public static int MoreThanHalfNum_Solution() {
        //1、用快排对序列进行排序
        //2、找到排序后n/2位置的数据，判断是否个数超过数组长度的一半
        if(array == null || array.length == 0)
            return 0;
        else{
            int len = array.length;
            quickSortRec(0, len-1);
            int result = array[len/2];
            if(!isMoreThanHalf(result))
                return 0;
            else
                return result;
        }
    }
    
    public static void quickSortRec(int left, int right){
        if(left>=right)
            return;
        else{
            int pivot = array[right];
            int partition = partionIt(left, right, pivot);
            if(partition > left)
            	quickSortRec(left, partition-1);//递归前一部分，划分
			if(partition < right)
				quickSortRec(partition+1, right);//递归后一部分，划分
        }
    }
    
    public static int partionIt(int left, int right, int pivot){
        int leftPtr = left-1;
        int rightPtr = right;
        while(true){
            while(array[++leftPtr]<pivot);
            while(rightPtr>0 && array[--rightPtr]>pivot);
            if(leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;
    }
    
    public static void swap(int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
    
    public static boolean isMoreThanHalf(int n){
        boolean result = false;
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == n)
                count++;
        }
        if(count>array.length/2)
            result = true;
        return result;
    }
}
