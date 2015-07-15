package com.offer.question41;

import java.util.ArrayList;

/**
 * 
 *��Ŀ����
 *С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
 *���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 *û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
 *���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
 *�������:
 *������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 *
 */
public class FindContinuousSequences {

	public static void main(String[] args) {
		
	}
	
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int small = 1;
		int big = 2;
		int curSum = small+big;
	    if(sum<=1){
	    	return lists;
	    }
	    if(sum==3){
	    	list.add(small);
	    	list.add(big);
	    	lists.add(list);
	    	return lists;
	    }
	    int mid = (1+sum)/2;
	    while(small < mid){
	    	if(curSum < sum){
	    		big++;
	    		curSum += big; 
	    	}else if(curSum == sum){
	    		addToLists(lists, small, big);
	    		big++;
	    		curSum += big;
	    	}else{
	    		curSum -= small; 
	    		small++;
	    	}
	    }
		return lists;
    }

	private ArrayList<ArrayList<Integer>> addToLists(ArrayList<ArrayList<Integer>> lists, int small, int big) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=small; i<=big; i++){
			list.add(i);
		}
		lists.add(list);
		return lists;
	}
}
