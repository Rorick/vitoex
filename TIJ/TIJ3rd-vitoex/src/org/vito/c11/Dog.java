//: c11:Dog.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package org.vito.c11;

public class Dog {
	private int dogNumber;
	
	/**
	 * ��������ŵĹ��췽��.
	 * @param i
	 */
	public Dog(int i) {
		dogNumber = i;
	}
	
	/**
	 * ��ӡ��ǰ���ı��.
	 */
	public void id() {
		System.out.println("Dog #" + dogNumber);
	}
} // /:~
