package com.offer.question42;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "I am a student.";
		System.out.println(ReverseSentences(str));
		System.out.print(LeftRotateString("abcdefg",2));
		System.out.print(replaceSpace(new StringBuffer("helloworld ")));
	}

//	public static String ReverseSentences(String str) {
//		//先翻转整个句子，再依次翻转每个单词
//		if(str==null || str.length()<=0)
//			return null;
//		String temp = reverse(str);
//		//翻转每个单词
//		char[] originStr = null;
//		originStr=temp.toCharArray();
//		int beginPtr=0;
//		int endPtr = 0;
//		while(beginPtr<temp.length()){
//			if(originStr[beginPtr]==' '){
//				beginPtr++;
//				endPtr++;
//			}else if(originStr[endPtr]==' ' || endPtr==temp.length()-1){
//				reverse(String.copyValueOf(originStr, beginPtr,endPtr-beginPtr));
//				beginPtr=endPtr;
//			}else{
//				endPtr++;
//			}
//		}
//		return String.valueOf(originStr);
//    }
//	
//	public static String reverse(String str){
//		if(str==null)
//			return null;
//		int leftPtr = 0;
//		int rightPtr = str.length()-1;
//		char[] originStr = null;
//		originStr=str.toCharArray();
//		while(leftPtr<=rightPtr){
//			char temp = originStr[leftPtr];
//			originStr[leftPtr]=originStr[rightPtr];
//			originStr[rightPtr]=temp;
//			leftPtr++;
//			rightPtr--;
//		}
//		return String.valueOf(originStr);
//	}
	public static String ReverseSentences(String str) {
		if(str.trim().equals("")){
            return str;
        }
        //每个单词保存在一个String数组中
		//a为[I, am, a, student.]
        String[] a = str.split(" ");
        StringBuffer sb = new StringBuffer();
        int i;
        for (i = a.length; i >0;i--){
        	sb.append(a[i-1]);
            if(i > 1){
            	sb.append(" ");
            }
        }
        return sb.toString();
    }
	
	public static String LeftRotateString(String str,int n) {
        if(str==null)
            return null;
        int length = str.length();
        if(length>0 && n>0 && n<length){
            int firstBegin=0;
            int firstEnd=n-1;
            int secondBegin=n;
            int secondEnd=length-1;
            ReverseSentences(str.substring(0,n));
            System.out.println(ReverseSentences(str.substring(0,n)));
            ReverseSentences(str.substring(n,length));
            System.out.println(ReverseSentences(str.substring(n,length)));
            return ReverseSentences(str.substring(0,length));
        }
        return null;
    }
	
	public static String replaceSpace(StringBuffer str) {
		if(str==null)
            return null;
//        String[] array = str.toString().split(" ");
//        StringBuffer sb = new StringBuffer();
//        int i;
//        for(i = 0; i<array.length;i++){
//            sb.append(array[i]);
//            if(i<array.length-1){
//                sb.append("%20");
//            }
//        }
//        if(str.toString().endsWith(" "))
//        	sb.append("%20");
//        return sb.toString();
		int beginPtr = 0;
		String originStr = str.toString();
		StringBuffer sb = new StringBuffer();
		while(beginPtr<originStr.length()){
			if(originStr.charAt(beginPtr)==' ')
				sb.append("%20");
			else
				sb.append(originStr.charAt(beginPtr));
			beginPtr++;
		}
		return sb.toString();
    }
	
	
}
