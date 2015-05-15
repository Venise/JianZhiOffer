package com.offer.question35;

/**
 * ��һ��ֻ����һ�ε��ַ�
 * ����"abaccdeff", ���'b'
 *
 */
public class FirstNotRepeatingChar {
	
	public static void main(String[] args) {
		System.out.print(findFirstNotRepeatingChar("abbaccddeeeff"));
	}
	
	private static char findFirstNotRepeatingChar(String charArray){
		//�ù�ϣ��
		//����ĸ��ASCII���ʾ��ϣ���Key�����ֵĴ�����ʾ��ϣ���Value
		if(charArray == null) 
			return '\0';
		int tableSize = 256;
		int[] hashtable = new int[tableSize];
		for(int i=0; i< 256; i++){
			hashtable[i] = 0;
		}
		int index = 0;
		while(index < charArray.length()) {
			hashtable[charArray.charAt(index)]++;//���ʸ�������
			index++;//ָ��ָ����һ��
		}
		index = 0;
		while(index < charArray.length()) {
			if(hashtable[charArray.charAt(index)] == 1) {
				//����ҵ��ˣ���ֱ��return
				return charArray.charAt(index);
			}
			index++;
		}
		//ִ�е��ˣ�����ûִ��return�˳�ѭ�������ʾ�����ڷ����������ַ�
		//����û�ҵ������Ҫ����
		return '\0';
	}
}
