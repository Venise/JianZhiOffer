package com.offer.question36;

public class InversePairsCount1 {

	private int[] array;
	
	public int InversePairs(int [] array) {
    	if(array==null || array.length==0)
            return 0;
    	this.array = array;
        int[] copy = new int[array.length];
        int count = InversePairsCore(copy,0,array.length-1);
        return count;
    }
    
    private int InversePairsCore(int[] result, int start, int end){
        if(start==end){
            return 0;//只有一个数字
        }
        int mid = (start+end)/2;
        int leftCount = InversePairsCore(result,start,mid);//左边内部的逆序对的个数，并排序
        int rightCount = InversePairsCore(result,mid+1,end);//右边内部的逆序对的个数，并排序
        //开始合并两个已排序子序列，边进行排序，边统计逆序对
        //三个指针
        int leftPtr=mid;
        int rightPtr=end;
        int mergeCount=0;
        int j=end;
        while(leftPtr>=start && rightPtr>mid){
            if(array[leftPtr]>array[rightPtr]){//如果左边>右边，存在逆序对
                mergeCount+=rightPtr-mid;
                result[j--]=array[leftPtr--];
            }else{
            	if(array[leftPtr]<array[rightPtr])
            		result[j--]=array[rightPtr--];
            	else{
            		mergeCount+=rightPtr-mid-1;
            		result[j--]=array[leftPtr--];
            		result[j--]=array[rightPtr--];
            	}
            }
        }
        while(leftPtr>=start){
        	result[j--]=array[leftPtr--];
        }
        while(rightPtr>mid){
        	result[j--]=array[rightPtr--];
        }
        for(j=end;j>=0;j--){
        	array[j]=result[j];
        }
        return leftCount + rightCount + mergeCount;
    }
}
