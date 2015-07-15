package com.offer.question40;

public class FindNumsAppearOnlyOnce {

	public void FindNumsAppearOnce(int[] array,int num1[] , int num2[]) {
        if(array==null || array.length<2)
            return;
        int result=0;
        for(int i=0;i<array.length;i++){
            result^=array[i];
        }
        num1[0]=0;
        num2[0]=0;
        int indexOf1 = FindFirstBitOf1(result);
        for(int j=0;j<array.length;j++){
            if(isBit1(array[j],indexOf1))
            	num1[0]^=array[j];
            else
                num2[0]^=array[j];
        }
    }
    
    public int FindFirstBitOf1(int result){
        //倒数第一个为1的位置
        int indexBit=0;
        while((result&1)==0){
        	result=result>>1;
            indexBit++;
        }
        return indexBit;
    }
    
    public boolean isBit1(int num, int indexBit){
        num=num>>indexBit;
        return (num&1)==1;
    }
}
