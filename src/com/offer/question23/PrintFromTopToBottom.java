package com.offer.question23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        Queue<Integer> theQueue = new LinkedList<Integer>();
        theQueue.offer(root.val);
        while(!theQueue.isEmpty()){
            list.add(theQueue.poll());
            if(root.left!=null)
                theQueue.offer(root.left.val);
            if(root.right!=null)
                theQueue.offer(root.right.val);
        }
        return list;
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
