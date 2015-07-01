package com.offer.question39;

public class IsBalancedTree {

	class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public static void main(String[] args) {

	}
	
//	public boolean IsBalanced_Solution(TreeNode root) {
//        int depth =0;
//        return IsBalanced_Solution(root, depth);
//    }
//     
//    public boolean IsBalanced_Solution(TreeNode root, int depth) {
//        //�߱��������ж�ÿ������ǲ���ƽ���
//        if(root==null){
//            depth = 0;
//            return true;
//        }
//        int leftDepth=0;
//        int rightDepth=0;
//        if(IsBalanced_Solution(root.left, leftDepth) && IsBalanced_Solution(root.right, rightDepth)){
//            int diff = leftDepth-rightDepth;
//            if(diff<=1 && diff>=-1){
//                depth = 1+(leftDepth>rightDepth?leftDepth:rightDepth);
//                return true;
//            }
//        }
//        return false;
//    }
	
	public boolean IsBalanced_Solution(TreeNode root) {
        //�ظ��������
        if(getHeight(root)==-1)
            return false;
        return true;
    }
    public int getHeight(TreeNode root){
        if(root==null)
            return 0;
        int leftHeight = getHeight(root.left);
        if(leftHeight==-1)
            return -1;
        int rightHeight = getHeight(root.right);
        if(rightHeight==-1)
            return -1;
        if(Math.abs(leftHeight-rightHeight)>1)
            return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }

}
