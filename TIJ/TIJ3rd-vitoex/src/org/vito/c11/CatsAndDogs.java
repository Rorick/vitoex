//: c11:CatsAndDogs.java
// Simple container example.
// {ThrowsException}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package org.vito.c11;

import java.util.*;

/**
 * "������ȱ�㣺δ֪����"��ʾ��.
 * ����������ü�������ʱ�Ͷ�ʧ�����͵���Ϣ,��ʹ�������е�Ԫ��ǰ����Ҫ������ת������.
 * Cat��Dog������������Ȼ����ȡ����.
 * @author vito
 *
 */
public class CatsAndDogs {
	public static void main(String[] args) {
		List cats = new ArrayList();
		for (int i = 0; i < 7; i++){
			cats.add(new Cat(i));
		}
		
		// Not a problem to add a dog to cats:
		cats.add(new Dog(7));		
		
		for (int i = 0; i < cats.size(); i++){
			((Cat) cats.get(i)).id();  //�õ���ֻ��Object�����ã���Ҫ������ת��ΪCat
		}
		// Dog is detected only at run time
	}
} // /:~
