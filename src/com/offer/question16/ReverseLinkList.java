package com.offer.question16;

import com.offer.question13.LinkNode;

public class ReverseLinkList {

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
		LinkNode node = reverseLinkList(null);
		if(node != null)
			System.out.println("反转链表的头结点： " + node.value);
		else
			System.out.println("链表为空 ");
	}

	public static LinkNode reverseLinkList(LinkNode headNode){
		if(headNode == null)
			return null;
		LinkNode currentNode = headNode;
		LinkNode previousNode = null;
		while(currentNode != null){//判断条件，不是currentNode.nextNode!=null
			LinkNode nextNode = currentNode.nextNode;//nextNode=null,表明当前结点为原链表的尾结点
			currentNode.nextNode = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
}
