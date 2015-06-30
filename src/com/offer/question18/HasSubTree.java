package com.offer.question18;

public class HasSubTree {

	class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //树的遍历：递归
        //判断子树与B是否有相同的结点
    	boolean result = false;
        if(root1!=null && root2!=null){
            if(root1.val == root2.val)
                result = DoesTree1HasTree2(root1, root2);
            if(!result)
                result = HasSubtree(root1.left, root2);
            if(!result)
                result = HasSubtree(root1.right, root2);
        }
        return result;
    }
    
    public boolean DoesTree1HasTree2(TreeNode root1,TreeNode root2){
        //递归的终止条件是到达了树A或者树B的叶结点
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(root1.val != root2.val)
            return false;
        return DoesTree1HasTree2(root1.left, root2.left) && DoesTree1HasTree2(root1.right, root2.right);
    }
}
