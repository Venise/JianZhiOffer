package com.offer.question13;

public class LinkList {
	private LinkNode first;
	
	public LinkList(){
		first = null;
	}
	
	//头插法
	public void insertFirst(int value){
		LinkNode newLink = new LinkNode(value);
		newLink.nextNode = first;
		first = newLink;
	}
	
	//是否为空
	public boolean isEmpty(){
		return first == null;
	}
	
	//删除头结点
	public LinkNode deteteFirst(){
		LinkNode temp = first;
		first = temp.nextNode;
		return temp;
	}
	
	//显示列表
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
