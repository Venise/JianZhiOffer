package com.offer.question07;

import java.util.Stack;

/**
 * 用两个栈实现队列的appendTail和deleteHead方法
 * @param <T>
 *
 */
public class TwoStacksCovertToQueue<T> implements CQueue<T>{
	private Stack<T> stack1;
	private Stack<T> stack2;
	
	public TwoStacksCovertToQueue(){
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
	}
	
	//尾部插入，相当于Stack的top为Queue的尾部
	@Override
	public void appendTail(T node) {
		stack1.push(node);
		System.out.println("添加成功");
	}
	
	//删除头部，相当于首先要删除Stack栈底的元素，最后删除栈顶的元素
	//将stack1的元素pop后依次push到stack2,stack2再弹出时，即为删除Queue的头部
	//考虑stack1{1,2,3,4,5},stack2{5,4,3,2,1},当stack2弹出5,4时,stack1再进入数值，怎么处理
	@Override
	public T deleteHead() {
		//当stack2元素全部pop出去后，再进行push，保证顺序不会变化
		if(stack2.isEmpty()){
			while(!stack1.isEmpty())
				stack2.push(stack1.pop());
		}
		System.out.println("删除成功");
		//此处可考虑判断stack2是否为空
		if(stack2.isEmpty()) {
			try {
				throw new Exception("Queue is Empty");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stack2.pop();
	}
	
	public void display(){
		while(!stack2.isEmpty()){
			for (T str : stack2) { 
                System.out.println(str + " "); 
			}
        } 
		System.out.println();
	}
}
