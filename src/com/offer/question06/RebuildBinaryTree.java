package com.offer.question06;

/**
 * ��֪��
 * ���������{1,2,4,7,3,5,6,8}
 * ���������{4,7,2,1,5,3,8,6}
 * �������
 */
public class RebuildBinaryTree {

	private static int[] preOrder = {1,2,4,7,3,5,6,8};
	private static int[] inOrder = {4,7,2,1,5,3,8,6};
	
	public static void main(String[] args) {
		
	}

//	private static BinaryTree construct(int[] preOrder, int[] inOrder, int length){
//		if(preOrder == null || inOrder == null || length <=0)
//			return null;
//		//TODO 
//		return null;
//	}
//	
//	private static BinaryTreeNode rebuildRec(int preOrderStart, int preOrderEnd, int inOrderStart, int inOrderEnd){
//		
//		
//		//���ĸ����
//		BinaryTreeNode root = new BinaryTreeNode(preOrder[preOrderStart]);
//		int position = findPosition(preOrder[preOrderStart], inOrder);
//		
//		if(position == 0){
//			//û���Һ���
//			root.rightChild = null;
//			root.leftChild = rebuildRec(preOrderStart+1, preOrderStart+1+position,0,0);
//		}else if(position == inOrder.length-1){
//			//û������
//			root.leftChild = null;
//			root.rightChild = rebuildRec(0,0,inOrderStart+1, inOrderStart+1+position);
//		}else{
//			//�����Һ���
//			root.leftChild = rebuildRec(preOrderStart+1, preOrderStart+1+position,0,0);
//			root.rightChild = rebuildRec(preOrderStart+1, preOrderStart+1+position,0,0);
//		}
//		return null;
//		
//	}
//
//	private static int findPosition(int value, int[] inOrder) {
//		int postion = -1;
//		for(int i=0; i<inOrder.length; i++){
//			if(inOrder[i] == value){
//				postion = i;
//				break;
//			}
//		}
//		return postion;
//	}
	
}
