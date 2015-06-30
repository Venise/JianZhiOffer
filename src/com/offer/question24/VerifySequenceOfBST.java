package com.offer.question24;

import java.util.Arrays;

public class VerifySequenceOfBST {

	public static void main(String[] args) {
		int[] sequence = {7,4,6,5};
		VerifySquenceOfBST(sequence);
		System.out.print(VerifySquenceOfBST(sequence));
	}

	public static boolean VerifySquenceOfBST(int [] sequence) {
        //后序遍历：最后结点为根结点
        //二叉搜索树：左子树小于根结点；右子树大于根结点
        if(sequence==null || sequence.length<=0)
            return false;
        int root = sequence[sequence.length-1];
        //二叉搜索树中左子树所有结点小于根节点
        //先找出左右子树分界点
        int i=0;
        for(; i<sequence.length-1;i++){//此处为sequence.length-1，而不是sequence.length
            if(sequence[i]>root)
                break;
        }
        //右子树结点大于根节点
        //找分界点的时候，已经默认左子树的所有节点值小于根节点，所以只需判断右子树
        int j=i;//此时i为数组中第一个值大于根节点值的位置，即0~i-1为左子树，i~length为右子树
        for(; j<sequence.length-1;j++){//此处为sequence.length-1，而不是sequence.length
            if(sequence[j]<root)
                return false;
        }
        
        //递归判断左子树是不是BST
        boolean left = true;
        if(i>0)//存在左子树。i=0时只有右子树
            left=VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));//此处为i，而不是i-1，不包括i位置的元素
        boolean right = true;
        if(i<sequence.length-1)//此处为sequence.length-1，而不是sequence.length
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length-1));
        return (left&&right);
    }
}
