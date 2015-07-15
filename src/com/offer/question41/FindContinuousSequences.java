package com.offer.question41;

import java.util.ArrayList;

/**
 * 
 *题目描述
 *小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 *但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 *没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 *现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *输出描述:
 *输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
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
