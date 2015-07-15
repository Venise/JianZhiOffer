package com.offer.question44;

/**
 *扑克牌的顺子
 */
public class IsContinuousCard {

	public static void main(String[] args) {
		int[] array = {1,3,0,5,0};
		System.out.print(isContinuous(array));
	}

	public static boolean isContinuous(int [] numbers) {
		//1、排序
		//2、有重复数字，肯定不是顺子
		//3、相邻数字之间个数需要0的个数
		//4、总共0的个数小于需要的个数，则不是顺子
		if(numbers==null || numbers.length==0)
			return false;
		insert(numbers);
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i]);
		}
		System.out.println();
		int numberOf0 = 0;
		int numberOfGap = 0;
		int i=0;
		for(; i<numbers.length; i++)
			if(numbers[i]==0)
				numberOf0++;
		System.out.println("numberOf0="+numberOf0);
		i=0;
		while(i<numbers.length-1){
			if(numbers[i]==0){
				i++;
				continue;
			}
			if(numbers[i]==numbers[i+1])
				return false;
			numberOfGap += numbers[i+1]-numbers[i]-1;
			i++;
		}
		System.out.println("numberOfGap="+numberOfGap);
		if(numberOfGap > numberOf0)
			return false;
		else
			return true;
    }
	
	private static int[] insert(int[] array) {
		int outer, inner;
		for(outer=0; outer<array.length; outer++){
			int temp = array[outer];//记录当前元素的值，而不是位置，因为当前位置上的数据可能会被交换数值
			inner = outer;
			while(inner>0 && array[inner-1]>temp){//inner>0必须在temp < array[inner-1]前面
				//还没找到位置，指针向前走
				array[inner] = array[inner-1];//会一直交换
				inner--;
			}
			array[inner] = temp;
		}
		return array;
	}
}
