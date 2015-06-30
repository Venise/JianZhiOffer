package com.offer.question24;

import java.util.Arrays;

public class VerifySequenceOfBST {

	public static void main(String[] args) {
		int[] sequence = {7,4,6,5};
		VerifySquenceOfBST(sequence);
		System.out.print(VerifySquenceOfBST(sequence));
	}

	public static boolean VerifySquenceOfBST(int [] sequence) {
        //��������������Ϊ�����
        //������������������С�ڸ���㣻���������ڸ����
        if(sequence==null || sequence.length<=0)
            return false;
        int root = sequence[sequence.length-1];
        //���������������������н��С�ڸ��ڵ�
        //���ҳ����������ֽ��
        int i=0;
        for(; i<sequence.length-1;i++){//�˴�Ϊsequence.length-1��������sequence.length
            if(sequence[i]>root)
                break;
        }
        //�����������ڸ��ڵ�
        //�ҷֽ���ʱ���Ѿ�Ĭ�������������нڵ�ֵС�ڸ��ڵ㣬����ֻ���ж�������
        int j=i;//��ʱiΪ�����е�һ��ֵ���ڸ��ڵ�ֵ��λ�ã���0~i-1Ϊ��������i~lengthΪ������
        for(; j<sequence.length-1;j++){//�˴�Ϊsequence.length-1��������sequence.length
            if(sequence[j]<root)
                return false;
        }
        
        //�ݹ��ж��������ǲ���BST
        boolean left = true;
        if(i>0)//������������i=0ʱֻ��������
            left=VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));//�˴�Ϊi��������i-1��������iλ�õ�Ԫ��
        boolean right = true;
        if(i<sequence.length-1)//�˴�Ϊsequence.length-1��������sequence.length
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length-1));
        return (left&&right);
    }
}
