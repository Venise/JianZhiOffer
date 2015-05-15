package com.offer.question05;

import java.util.Stack;

/**
 * 
 * ��β��ͷ��ӡ����
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
//		printListFromTailToHeadRec(node1);//�ݹ����б���
	}
	

	private static void printListFromTailToHeadStack(LinkNode startNode){
		if(startNode == null) {
			System.out.print("������");
			return;
		}
		Stack<LinkNode> stacks = new Stack<LinkNode>();
		LinkNode currentNode = startNode;
		while(currentNode!= null) {//��Ϊ��,��ʼ����ɨ��ÿ���ڵ�
			//��Stackװ�ؽڵ�
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

