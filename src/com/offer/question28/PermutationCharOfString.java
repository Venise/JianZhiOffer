package com.offer.question28;

import java.util.ArrayList;

/**
 * 将字符串的字符进行排列
 */
public class PermutationCharOfString {

	public static void main(String[] args) {
		ArrayList<String> resultList = new ArrayList<String>();
		resultList = Permutation("abcd");
		for(int i=0; i<resultList.size();i++){
			System.out.print(resultList.get(i) + " ");
		}
	}
		
	public static ArrayList<String> Permutation(String str) {
        ArrayList<String> resultList=new ArrayList<String>();
        int length=str.length();
        if(length==0){
       	 	return resultList;
        }
        if(length==1){
            resultList.add(str);//只有一个字符，直接返回
            System.out.println("Line26 str=" + str);
            return resultList;
   	 	}
        for(int m=0;m<length;m++){
            String subStr=str.substring(0,m)+str.substring(m+1,length);
            System.out.println("Line31 m=" + m + " subStr=" + subStr);
            
            ArrayList<String> subResultList=Permutation(subStr);
            for(String tempStr:subResultList){
                String string=str.charAt(m)+tempStr;
                System.out.println("Line36 m=" + m + " string=" + string);
                if(!resultList.contains(string)){
                    resultList.add(string);
                }
   	 		}
//        	int listSize=resultList.size();
//            for(int i=0;i<listSize-1;i++){//按字典顺序排列
//                for(int j=i;j<listSize-1;j++){
//                    if((resultList.get(j).compareTo(resultList.get(j+1)))==1){
//                        String temp=resultList.get(j);
//                        resultList.set(j, resultList.get(j+1));
//                        resultList.set(j+1, temp);
//                    }
//                }
//            }
        }
    return resultList;
    }

}
