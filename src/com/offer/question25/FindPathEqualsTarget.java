package com.offer.question25;

import java.util.ArrayList;
import java.util.Stack;

public class FindPathEqualsTarget {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

//	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
//        //�����������DFS
//        //ʹ��ջ
//        //1�����������ջ
//        //2���ۼӣ�����������ջ��ֱ��Ҷ�ӽ��
//        //3�������Ϊtarget���򱣴棻�������
//        //4��������������������
//        
//        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
//        if(root==null)
//            return lists;
//        Stack<Integer> theStack = new Stack<Integer>();
//        int sum=0;
//        return findThePath(root, target, theStack,lists,sum);
//    }
//    
//    public ArrayList<ArrayList<Integer>>  findThePath(TreeNode root,int target,
//                  Stack<Integer> theStack,ArrayList<ArrayList<Integer>> lists,int sum){
//        sum+=root.val;
//        theStack.push(root.val);
//        boolean isLeaf = root.left==null && root.right==null;
//        if(sum==target && isLeaf){
//            ArrayList<Integer> list = new ArrayList<Integer>();
//            Stack<Integer> stack = new Stack<Integer>();
//            for(int i:stack){
//                list.add(new Integer(i));
//            }
//            lists.add(list);
//        }
//        if(root.left!=null)
//            findThePath(root.left,target,theStack,lists,sum);
//        if(root.right!=null)
//            findThePath(root.right,target,theStack,lists,sum);
//        sum-=theStack.pop();
//        return lists;
//    }
	
	ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list=new ArrayList<Integer>();
    int currentNum=0;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        //ʹ���������������ȷ����������������������ʡ�
		//ÿ�η����������£�
		//1.�Ӻͣ��ж��Ƿ�ΪҶ�ӽ��
		//2.��=����ֵ��������Ҷ�ӣ�����·�� 
        if(root==null){
            return lists;
        }
         
        //��ӵ�ǰ�ڵ㵽·���б��� ��·���ͼ��ϵ�ǰ�ڵ�
        currentNum=currentNum+root.val;
        list.add(root.val);
         
        //���·���͵���target��ΪҶ�ӽڵ� �����
        if(currentNum==target&&root.left==null&&root.right==null){
            ArrayList<Integer> path=new ArrayList<Integer>();
            for(int i=0;i<list.size();i++){
                path.add(list.get(i));
            }
            lists.add(path);
        }
         
        if(root.left!=null){
            FindPath(root.left,target);
        }
        if(root.right!=null){
            FindPath(root.right,target);
        }
         
        //����ǰ�㴦����,��ȥ��ǰ�ڵ�,�Ƴ���ǰ�ڵ�
        currentNum=currentNum-root.val;
        if(list.size()>0){
            list.remove(list.size()-1);
        }
        return lists;
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
