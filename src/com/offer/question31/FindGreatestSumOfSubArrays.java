package com.offer.question31;

/**
 * ���������������
 * �磺{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * @author MeiQin
 *
 */
public class FindGreatestSumOfSubArrays {

	public static void main(String[] args) {

	}
	
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null || array.length==0)
			return 0;
		int currentSum = 0;
		int greatestSum = 0x80000000;
		for(int i=0; i<array.length;i++){
			if(currentSum <= 0)
				currentSum = array[i];
			else
				currentSum += array[i];
			if(currentSum > greatestSum)
				greatestSum = currentSum;
		}
		return greatestSum;
    }
}
