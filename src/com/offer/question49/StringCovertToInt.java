package com.offer.question49;

public class StringCovertToInt {

	public static void main(String[] args) {
		
		
		
		
	}
	
	public int StrToInt(String str) {
		//����"" "+123" "-123" �Լ���'0'~'9'������ַ� 
		if(str==null || "".equals(str) || str.length()==0)
			return 0;
		boolean minus = false;
		int i=0;
		int num = 0;
		while(i<str.length()){
            if(i==0){
                if(str.charAt(0)=='-'){
                    minus = true;
                    i++;
                    continue;
				}
                if(str.charAt(0)=='+'){
                    i++;
                    continue;
                }
            }
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				num = num*10 + (str.charAt(i)-'0');
				i++;
			}else{//��'0'~'9'������ַ� 
				num=0;
                return 0;
			}
		}
		if(minus)
			num=0-num;
		return num;
    }
}
