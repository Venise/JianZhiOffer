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
        //�ݹ��������������������������������Ҷ�ӽ��
        if(root.left==null && root.right==null)//ע�⣺��&&�������� ||
        	/*�𰸴���:���ύ�ĳ���û��ͨ�����еĲ�������
        	��������:
        	{8,7,#,6,#,5,#,4}
        	��Ӧ���Ӧ��Ϊ:
        	{8,#,7,#,6,#,5,#,4} */
            return;
        //�Ƚ��������������ٵݹ齻��������
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
