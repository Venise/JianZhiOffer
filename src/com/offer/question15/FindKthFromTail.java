package com.offer.question15;

public class FindKthFromTail {

	public static void main(String[] args) {
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(2);
		LinkNode node3 = new LinkNode(3);
		LinkNode node4 = new LinkNode(4);
		LinkNode node5 = new LinkNode(5);
		LinkNode node6 = new LinkNode(6);
		node1.nextNode = node2;
		node2.nextNode = node3;
		node3.nextNode = node4;
		node4.nextNode = node5;
		node5.nextNode = node6;
		node6.nextNode = null;
		LinkNode node = find(node1, 3);
		if(node!=null)
			System.out.println(node.value);
	}
	
	/*
	 * 两个指针：p1 p2
	 * 指针|起始位置|移动步数|索引|第二次移动步数|最后索引
	 * p1: |    0   |k-1	|k-1 |		n-k    | n-1
	 * p2: |    0   |n-k	|n-k |			   | n-k(所找位置，倒数第K个数)
	 */
	public static LinkNode find(LinkNode headNode, int k){
		if(headNode == null || k<=0) {
			System.out.println("invalid parameter input");
			return null;
		}
		LinkNode prevPtrNode = headNode;
		LinkNode curPtrNode = headNode;
		int j=0;//计数
		while(j<k-1){
			if(prevPtrNode.nextNode!=null){
				prevPtrNode = prevPtrNode.nextNode;
				j++;//最后j=k-1
			}else{
				System.out.println("invalid parameter:k is bigger than the length of LinkList");
				return null;//此处不要用break;因为break只是跳出当前while循环，下面的while循环语句仍会执行
			}
		}
		while(prevPtrNode.nextNode!=null){//能执行到此，而没有提前return,表明为正常执行查找
			prevPtrNode = prevPtrNode.nextNode;
			curPtrNode = curPtrNode.nextNode;
		}
		return curPtrNode;
	}
}
