package com.offer.question13;

/**
 * ����һ��ͷָ��ͽ��ָ�룬��o(1)ʱ����ɾ��������ָ�����
 * �Ƚ���ǰҪɾ���Ľ�����һ������ֵ���Ƶ���ǰ���
 * ����ָ��
 * ɾ�����
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
		//�������
		if(toDeleteNode == headNode && headNode.nextNode == null) {
			toDeleteNode = null;
			headNode = null;
		}
		//�����㣬ͷ���
		else if(headNode == toDeleteNode){
			toDeleteNode = null;
			headNode = headNode.nextNode;
		}
		//�����㣬β���
		else if(toDeleteNode.nextNode == null){
			LinkNode theNode = headNode;
			while(theNode.nextNode != toDeleteNode)
				theNode = theNode.nextNode;
			theNode.nextNode = null;
			toDeleteNode = null;
		}
		//�����㣬�м���
		else{
			LinkNode theNextNode = toDeleteNode.nextNode;
			//����ǰҪɾ���Ľ�����һ������ֵ���Ƶ���ǰ���
			toDeleteNode.value = theNextNode.value;
			//����һ��������һ�������Ϊ��ɾ��������һ�����
			toDeleteNode.nextNode = theNextNode.nextNode;
			//ɾ����һ�����
			theNextNode = null;
		}
	}
}
