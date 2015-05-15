package com.offer.question13;

public class LinkList {
	private LinkNode first;
	
	public LinkList(){
		first = null;
	}
	
	//ͷ�巨
	public void insertFirst(int value){
		LinkNode newLink = new LinkNode(value);
		newLink.nextNode = first;
		first = newLink;
	}
	
	//�Ƿ�Ϊ��
	public boolean isEmpty(){
		return first == null;
	}
	
	//ɾ��ͷ���
	public LinkNode deteteFirst(){
		LinkNode temp = first;
		first = temp.nextNode;
		return temp;
	}
	
	//��ʾ�б�
	public void displayList(){
		System.out.println("List(first --> last)");
		LinkNode current = first;
		while(current != null) {
			current.display();
			current = current.nextNode;
		}
		System.out.println();
	}

	public LinkNode getFirst() {
		return first;
	}
	
}
