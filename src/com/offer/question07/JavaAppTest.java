package com.offer.question07;

public class JavaAppTest {

	public static void main(String[] args) {
		CQueue<String> queue = new TwoStacksCovertToQueue<String>();
		queue.appendTail("1");
		queue.appendTail("2");
		queue.appendTail("3");
		queue.appendTail("4");
		queue.appendTail("5");
		queue.deleteHead();
		queue.appendTail("6");
		queue.deleteHead();
		queue.deleteHead();
		queue.deleteHead();
		queue.deleteHead();
		queue.display();
	}

}
