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
//        //深度优先搜索DFS
//        //使用栈
//        //1、将根结点入栈
//        //2、累加，将左子树入栈，直到叶子结点
//        //3、如果和为target，则保存；否则，清除
//        //4、对右子树做上述操作
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
        //使用先序遍历，这样确保根结点先于左右子树访问。
		//每次访问做两件事：
		//1.加和，判断是否为叶子结点
		//2.和=输入值？并且是叶子，保存路径 
        if(root==null){
            return lists;
        }
         
        //添加当前节点到路径列表中 给路径和加上当前节点
        currentNum=currentNum+root.val;
        list.add(root.val);
         
        //如果路径和等于target且为叶子节点 则输出
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
         
        //当当前层处理完,减去当前节点,移除当前节点
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
