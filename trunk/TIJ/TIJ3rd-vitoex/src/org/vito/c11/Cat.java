//: c11:Cat.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package org.vito.c11;

/**
 * 
 * @author vito
 *
 */
public class Cat {
	private int catNumber;
	
	/**
	 * ����è��ŵĹ��췽��.
	 * @param i
	 */
	public Cat(int i) {
		catNumber = i;
	}
	
	/**
	 * ��ӡ��ǰè�ı��.
	 */
	public void id() {
		System.out.println("Cat #" + catNumber);
	}
} // /:~
