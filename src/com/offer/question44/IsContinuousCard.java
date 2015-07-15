package com.offer.question44;

/**
 *�˿��Ƶ�˳��
 */
public class IsContinuousCard {

	public static void main(String[] args) {
		int[] array = {1,3,0,5,0};
		System.out.print(isContinuous(array));
	}

	public static boolean isContinuous(int [] numbers) {
		//1������
		//2�����ظ����֣��϶�����˳��
		//3����������֮�������Ҫ0�ĸ���
		//4���ܹ�0�ĸ���С����Ҫ�ĸ���������˳��
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
			int temp = array[outer];//��¼��ǰԪ�ص�ֵ��������λ�ã���Ϊ��ǰλ���ϵ����ݿ��ܻᱻ������ֵ
			inner = outer;
			while(inner>0 && array[inner-1]>temp){//inner>0������temp < array[inner-1]ǰ��
				//��û�ҵ�λ�ã�ָ����ǰ��
				array[inner] = array[inner-1];//��һֱ����
				inner--;
			}
			array[inner] = temp;
		}
		return array;
	}
}
