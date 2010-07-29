//: com:bruceeckel:util:Collections2.java
// To fill any type of container using a generator object.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package org.vito.util;

import java.util.*;

public class Collections2 {
	/**
	 * Fill an array using a generator:
	 * @param c Collection
	 * @param gen Generator
	 * @param count
	 */
	public static void fill(Collection c, Generator gen, int count) {
		for (int i = 0; i < count; i++)
			c.add(gen.next());
	}
	
	/**
	 * ���һ��Mapӳ��.
	 * @param m Map
	 * @param gen MapGenerator
	 * @param count
	 */
	public static void fill(Map m, MapGenerator gen, int count) {
		for (int i = 0; i < count; i++) {
			Pair p = gen.next();
			m.put(p.key, p.value);
		}
	}
	
	/**
	 * ����ַ����Ե�������.
	 * @author vito
	 *
	 */
	public static class RandStringPairGenerator implements MapGenerator {
		private Arrays2.RandStringGenerator gen;
		
		/**
		 * �����ַ������ȵĹ��췽��.
		 * @param len
		 */
		public RandStringPairGenerator(int len) {
			gen = new Arrays2.RandStringGenerator(len);
		}
		
		/**
		 * �����ַ���ӳ�����һ��.
		 */
		public Pair next() {
			return new Pair(gen.next(), gen.next());
		}
	}

	// Default object so you don't have to create your own:
	/**
	 * ����ַ�����Ե�������,ÿ���ַ�������Ϊ10.
	 */
	public static RandStringPairGenerator rsp = new RandStringPairGenerator(10);

	/**
	 * �ַ�����Ե�������
	 * @author vito
	 *
	 */
	public static class StringPairGenerator implements MapGenerator {
		private int index = -1;
		private String[][] d;
		
		/**
		 * ����һ��2ά�ַ�������Ĺ��췽��.
		 * @param data
		 */
		public StringPairGenerator(String[][] data) {
			d = data;
		}
		
		/**
		 * ������һ�����.
		 * �ڶ�ά�ĵ�һ���±��Ƕ�Ӧ�ļ�,�ڶ����±��Ƕ�Ӧ��ֵ.
		 */
		public Pair next() {
			// Force the index to wrap:
			index = (index + 1) % d.length;
			return new Pair(d[index][0], d[index][1]);
		}

		public StringPairGenerator reset() {
			index = -1;
			return this;
		}
	}

	// Use a predefined dataset:
	/**
	 * �ַ����Ե�������,���ɹ���,�׶��Ķ�Ӧ��ϵ.
	 */
	public static StringPairGenerator geography = new StringPairGenerator(
			CountryCapitals.pairs);

	/**
	 * Produce a sequence from a 2D array:
	 * @author vito
	 *
	 */
	public static class StringGenerator implements Generator {
		private String[][] d;
		private int position;
		private int index = -1;
		
		/**
		 * ���췽��,����һ��2ά����͵ڶ�ά��λ���±�.
		 * @param data 2ά����
		 * @param pos �ڶ�ά��λ���±�
		 */
		public StringGenerator(String[][] data, int pos) {
			d = data;
			position = pos;
		}
		
		/**
		 * �Ը����ĵڶ�ά�±�,������һ��.
		 */
		public Object next() {
			// Force the index to wrap:
			index = (index + 1) % d.length;
			return d[index][position];
		}

		public StringGenerator reset() {
			index = -1;
			return this;
		}
	}

	// Use a predefined dataset:
	/**
	 * �ַ���������,���ɹ�����.
	 */
	public static StringGenerator countries = new StringGenerator(
			CountryCapitals.pairs, 0);
	
	/**
	 * �ַ���������,�����׶���.
	 */
	public static StringGenerator capitals = new StringGenerator(
			CountryCapitals.pairs, 1);
} // /:~
