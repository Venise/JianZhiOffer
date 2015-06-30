package com.offer.question19;

public class MirrorTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void Mirror(TreeNode root) {
    	if(root==null)
            return;
        //递归结束条件：到达左子树和者右子树的叶子结点
        if(root.left==null && root.right==null)//注意：是&&，而不是 ||
        	/*答案错误:您提交的程序没有通过所有的测试用例
        	测试用例:
        	{8,7,#,6,#,5,#,4}
        	对应输出应该为:
        	{8,#,7,#,6,#,5,#,4} */
            return;
        //先交换左右子树，再递归交换孙子树
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null)
            Mirror(root.left);
        if(root.right!=null)
            Mirror(root.right);
    }
	
	class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
}
