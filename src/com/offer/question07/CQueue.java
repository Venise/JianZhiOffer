package com.offer.question07;

/**
 * ����CQueue�ӿ�
 *
 * @param <T>
 */
public interface CQueue<T> {
	public void appendTail(T node);
	public T deleteHead();
	public void display();
}
