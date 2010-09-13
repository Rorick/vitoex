package org.vito.c10;

//: c10:SweetShop.java
// Examination of the way the class loader works.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import org.vito.simpletest.*;

/**
 * Class����ʾ��.
 * Class���������Ҫʱ������.
 * ĳ���Class���������ڴ�,�ͱ����������������еĶ���.
 * 
 * main�д�������Ĵ��뱻���ڴ�ӡ���֮ǰ,�԰��������жϼ��ص�ʱ���
 */

class Candy {
	static {  //�����һ�α�����ʱִ��.
		System.out.println("Loading Candy");
	}
}

class Gum {
	static {
		System.out.println("Loading Gum");
	}
}

class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}

public class SweetShop {
	private static Test monitor = new Test();

	public static void main(String[] args) {
		System.out.println("inside main");
		
		new Candy();
		System.out.println("After creating Candy");
		
		try {
			//Class.forName("Gum");
			Class.forName("org.vito.c10.Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn't find Gum");
		}
		System.out.println("After Class.forName(\"Gum\")");
		
		new Cookie();
		System.out.println("After creating Cookie");
		
		monitor.expect(new String[] { "inside main", "Loading Candy",
				"After creating Candy", "Loading Gum",
				"After Class.forName(\"Gum\")", "Loading Cookie",
				"After creating Cookie" });
	}
} // /:~
