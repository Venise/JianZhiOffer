package com.offer.question06;

/**
 * 已知：
 * 先序遍历：{1,2,4,7,3,5,6,8}
 * 中序遍历：{4,7,2,1,5,3,8,6}
 * 求二叉树
 */
public class RebuildBinaryTree {

	private static int[] preOrder = {1,2,4,7,3,5,6,8};
	private static int[] inOrder = {4,7,2,1,5,3,8,6};
	
	public static void main(String[] args) {
	}

	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	if(pre==null || in==null || pre.length==0 || in.length==0 || pre.length!=in.length)
            return null;
        //传递参数？最后还是原数组还是分割后的数组？答案是分割后的数组。
    	int rootValue = pre[0];
    	TreeNode root = new TreeNode(rootValue);
    	root.left=root.right=null;
    	if(pre==in){
    		if(pre.length==1)
    			return root;
    		else
    			return null;
    	}
    	
    	//在中序遍历中找到根结点的值
    	int rootPtr = 0;
    	while(rootPtr<in.length && in[rootPtr]!=rootValue)
    		rootPtr++;//最后指针停留在中序遍历数组的根节点数据的位置
    	if(rootPtr==in.length-1 && in[rootPtr]!=rootValue){
    		return null;
    	}
    	//开始截取数组
    	//左子树的长度
    	int leftLength = rootPtr;
    	if(leftLength>0){
        	int[] newLeftPre = new int[leftLength];
        	int[] newLeftIn = new int[leftLength];
        	
        	for(int i=1; i<=leftLength;i++)
        		newLeftPre[i-1]=pre[i];
        	for(int i=0; i<=leftLength-1;i++)
        		newLeftIn[i]=in[i];
        	root.left = reConstructBinaryTree(newLeftPre, newLeftIn);
    	}
    	if(leftLength<pre.length-1){//存在右子树
        	int[] newLeftPre = new int[pre.length-1-leftLength];
        	int[] newLeftIn = new int[pre.length-1-leftLength];
        	
        	for(int i=1+leftLength; i<=pre.length-1;i++)
        		newLeftPre[i-1-leftLength]=pre[i];
        	for(int i=rootPtr+1; i<=in.length-1;i++)
        		newLeftIn[i-1-rootPtr]=in[i];
        	root.right = reConstructBinaryTree(newLeftPre, newLeftIn);
    	}
        return root;
    }
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x; 
		}
	}
}
