//: c11:MouseTrap.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package org.vito.c11;

/**
 * ץ����~
 * @author vito
 *
 */
public class MouseTrap {
	/**
	 * �����ݵ�Object����,����ת��ΪMouse.
	 * ��ӡ����ĵ�ǰ���.
	 * @param m 
	 */
	static void caughtYa(Object m) {
		Mouse mouse = (Mouse) m; // Cast from Object
//		System.out.println(m);
		System.out.println("Mouse: " + mouse.getNumber());
	}
} // /:~