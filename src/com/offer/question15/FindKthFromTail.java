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
	 * ����ָ�룺p1 p2
	 * ָ��|��ʼλ��|�ƶ�����|����|�ڶ����ƶ�����|�������
	 * p1: |    0   |k-1	|k-1 |		n-k    | n-1
	 * p2: |    0   |n-k	|n-k |			   | n-k(����λ�ã�������K����)
	 */
	public static LinkNode find(LinkNode headNode, int k){
		if(headNode == null || k<=0) {
			System.out.println("invalid parameter input");
			return null;
		}
		LinkNode prevPtrNode = headNode;
		LinkNode curPtrNode = headNode;
		int j=0;//����
		while(j<k-1){
			if(prevPtrNode.nextNode!=null){
				prevPtrNode = prevPtrNode.nextNode;
				j++;//���j=k-1
			}else{
				System.out.println("invalid parameter:k is bigger than the length of LinkList");
				return null;//�˴���Ҫ��break;��Ϊbreakֻ��������ǰwhileѭ���������whileѭ������Ի�ִ��
			}
		}
		while(prevPtrNode.nextNode!=null){//��ִ�е��ˣ���û����ǰreturn,����Ϊ����ִ�в���
			prevPtrNode = prevPtrNode.nextNode;
			curPtrNode = curPtrNode.nextNode;
		}
		return curPtrNode;
	}
}
