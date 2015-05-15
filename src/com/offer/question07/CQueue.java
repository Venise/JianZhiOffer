package com.offer.question07;

/**
 * ÉùÃ÷CQueue½Ó¿Ú
 *
 * @param <T>
 */
public interface CQueue<T> {
	public void appendTail(T node);
	public T deleteHead();
	public void display();
}
