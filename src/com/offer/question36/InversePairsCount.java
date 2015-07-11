package com.offer.question36;

public class InversePairsCount {

	public int InversePairs(int [] array) {
    	if(array==null || array.length==0)
            return 0;
        int[] copy = array.clone();
        int count = InversePairsCore(array,copy,0,array.length-1);
        return count;
    }
    
    private static int InversePairsCore(int[] array, int[] result, int start, int end){
        if(start==end){
        	result[start]=array[start];
            return 0;//ֻ��һ������
        }
        int mid = (start+end)/2;
        int leftCount = InversePairsCore(result,array,start,mid);//����ڲ�������Եĸ�����������
        int rightCount = InversePairsCore(result,array,mid+1,end);//�ұ��ڲ�������Եĸ�����������
        //��ʼ�ϲ����������������У��߽������򣬱�ͳ�������
        //����ָ��
        int leftPtr=mid;
        int rightPtr=end;
        int mergeCount=0;
        int j=end;
        while(leftPtr>=start && rightPtr>mid){
            if(result[leftPtr]>result[rightPtr]){//������>�ұߣ����������
                mergeCount+=rightPtr-mid;
                array[j--]=result[leftPtr--];
            }else{
            	if(result[leftPtr]<result[rightPtr])
            		array[j--]=result[rightPtr--];
            	else{
            		mergeCount+=rightPtr-mid-1;
            		array[j--]=result[leftPtr--];
            		array[j--]=result[rightPtr--];
            	}
            }
        }
        while(leftPtr>=start){
        	array[j--]=result[leftPtr--];
        }
        while(rightPtr>mid){
        	array[j--]=result[rightPtr--];
        }
        return leftCount + rightCount + mergeCount;
    }
}
