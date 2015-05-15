package com.offer.question13;

/**
 * 给出一个头指针和结点指针，在o(1)时间内删除链表内指定结点
 * 先将当前要删除的结点的下一个结点的值复制到当前结点
 * 设置指针
 * 删除结点
 */
public class DeleteNodeO_1 {

	public static void main(String[] args) {
		LinkNode node1 = new LinkNode(1);
//		LinkNode node2 = new LinkNode(2);
//		LinkNode node3 = new LinkNode(3);
//		LinkNode node4 = new LinkNode(4);
//		LinkNode node5 = new LinkNode(5);
//		LinkNode node6 = new LinkNode(6);
		node1.nextNode = null;
//		node2.nextNode = node3;
//		node3.nextNode = node4;
//		node4.nextNode = node5;
//		node5.nextNode = node6;
//		node6.nextNode = null;
		
		deleteNode(node1, node1);
		
		LinkNode current = node1;
		while(current != null) {
			current.display();
			current = current.nextNode;
		}
		System.out.println();
	}
	
	private static void deleteNode(LinkNode headNode, LinkNode toDeleteNode){
		if(headNode == null || toDeleteNode == null) 
			return;
		//单个结点
		if(toDeleteNode == headNode && headNode.nextNode == null) {
			toDeleteNode = null;
			headNode = null;
		}
		//多个结点，头结点
		else if(headNode == toDeleteNode){
			toDeleteNode = null;
			headNode = headNode.nextNode;
		}
		//多个结点，尾结点
		else if(toDeleteNode.nextNode == null){
			LinkNode theNode = headNode;
			while(theNode.nextNode != toDeleteNode)
				theNode = theNode.nextNode;
			theNode.nextNode = null;
			toDeleteNode = null;
		}
		//多个结点，中间结点
		else{
			LinkNode theNextNode = toDeleteNode.nextNode;
			//将当前要删除的结点的下一个结点的值复制到当前结点
			toDeleteNode.value = theNextNode.value;
			//将下一个结点的下一个结点作为待删除结点的下一个结点
			toDeleteNode.nextNode = theNextNode.nextNode;
			//删除下一个结点
			theNextNode = null;
		}
	}
}
