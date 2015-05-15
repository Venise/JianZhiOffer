package com.offer.question17;

import com.offer.question13.LinkNode;

/**
 * 合并两个排序的链表
 */
public class MergeTwoSortedLinkLists {

	public static void main(String[] args) {
		LinkNode node11 = new LinkNode(1);
		LinkNode node12 = new LinkNode(3);
		LinkNode node13 = new LinkNode(4);
		LinkNode node14 = new LinkNode(7);
		node11.nextNode = node12;
		node12.nextNode = node13;
		node13.nextNode = node14;
		node14.nextNode = null;
		
		LinkNode node21 = new LinkNode(2);
		LinkNode node22 = new LinkNode(5);
		LinkNode node23 = new LinkNode(6);
		LinkNode node24 = new LinkNode(8);
		node21.nextNode = node22;
		node22.nextNode = node23;
		node23.nextNode = node24;
		node24.nextNode = null;
		LinkNode node = merge(node11, node21);
		while(node != null){
			System.out.print(node.value + " ");
			node = node.nextNode;
		}
		System.out.println();
	}
	
	private static LinkNode merge(LinkNode headNode1, LinkNode headNode2){
		if(headNode1 == null && headNode2== null) return null;
		if(headNode1 == null) return headNode2;
		if(headNode2 == null) return headNode1;
		LinkNode newHeadNode = null;
		if(headNode1.value < headNode2.value){
			newHeadNode = headNode1;
			newHeadNode.nextNode = merge(headNode1.nextNode, headNode2);
		}
		else{
			newHeadNode = headNode2;
			newHeadNode.nextNode = merge(headNode1, headNode2.nextNode);
		}
		return 	newHeadNode;
	}
}
