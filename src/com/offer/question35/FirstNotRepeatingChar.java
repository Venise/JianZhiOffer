package com.offer.question35;

/**
 * 第一个只出现一次的字符
 * 输入"abaccdeff", 输出'b'
 *
 */
public class FirstNotRepeatingChar {
	
	public static void main(String[] args) {
		System.out.print(findFirstNotRepeatingChar("abbaccddeeeff"));
	}
	
	private static char findFirstNotRepeatingChar(String charArray){
		//用哈希表
		//用字母的ASCII码表示哈希表的Key，出现的次数表示哈希表的Value
		if(charArray == null) 
			return '\0';
		int tableSize = 256;
		int[] hashtable = new int[tableSize];
		for(int i=0; i< 256; i++){
			hashtable[i] = 0;
		}
		int index = 0;
		while(index < charArray.length()) {
			hashtable[charArray.charAt(index)]++;//单词个数增加
			index++;//指针指向下一个
		}
		index = 0;
		while(index < charArray.length()) {
			if(hashtable[charArray.charAt(index)] == 1) {
				//如果找到了，就直接return
				return charArray.charAt(index);
			}
			index++;
		}
		//执行到此，若还没执行return退出循环，则表示不存在符合条件的字符
		//可能没找到的情况要考虑
		return '\0';
	}
}
