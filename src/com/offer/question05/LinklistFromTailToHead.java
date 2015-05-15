package com.offer.question05;

import java.util.Stack;

/**
 * 
 * 从尾到头打印链表
 *
 */
public class LinklistFromTailToHead {
	
	public static void main(String[] args){
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(3);
		LinkNode node3 = new LinkNode(4);
		LinkNode node4 = new LinkNode(5);
		LinkNode node5 = new LinkNode(7);
		LinkNode node6 = new LinkNode(9);
		node1.nextNode = node2;
		node2.nextNode = node3;
		node3.nextNode = node4;
		node4.nextNode = node5;
		node5.nextNode = node6;
		node6.nextNode = null;
		
		printListFromTailToHeadStack(node1);
//		printListFromTailToHeadRec(node1);//递归运行崩溃
	}
	

	private static void printListFromTailToHeadStack(LinkNode startNode){
		if(startNode == null) {
			System.out.print("空链表");
			return;
		}
		Stack<LinkNode> stacks = new Stack<LinkNode>();
		LinkNode currentNode = startNode;
		while(currentNode!= null) {//不为空,开始往后扫描每个节点
			//用Stack装载节点
			stacks.push(currentNode);
			startNode = startNode.nextNode;
		}
		while(!stacks.isEmpty()){
			LinkNode listNode = stacks.pop();
			listNode.display();
		}
	}
	
	@SuppressWarnings("unused")
	private static void printListFromTailToHeadRec(LinkNode startNode){
		while(startNode.nextNode != null) {
			printListFromTailToHeadRec(startNode.nextNode);
		}
		startNode.display();
	}
}

