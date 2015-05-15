package com.offer.question07;

import java.util.Stack;

/**
 * ������ջʵ�ֶ��е�appendTail��deleteHead����
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
	
	//β�����룬�൱��Stack��topΪQueue��β��
	@Override
	public void appendTail(T node) {
		stack1.push(node);
		System.out.println("��ӳɹ�");
	}
	
	//ɾ��ͷ�����൱������Ҫɾ��Stackջ�׵�Ԫ�أ����ɾ��ջ����Ԫ��
	//��stack1��Ԫ��pop������push��stack2,stack2�ٵ���ʱ����Ϊɾ��Queue��ͷ��
	//����stack1{1,2,3,4,5},stack2{5,4,3,2,1},��stack2����5,4ʱ,stack1�ٽ�����ֵ����ô����
	@Override
	public T deleteHead() {
		//��stack2Ԫ��ȫ��pop��ȥ���ٽ���push����֤˳�򲻻�仯
		if(stack2.isEmpty()){
			while(!stack1.isEmpty())
				stack2.push(stack1.pop());
		}
		System.out.println("ɾ���ɹ�");
		//�˴��ɿ����ж�stack2�Ƿ�Ϊ��
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
