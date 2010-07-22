package org.vito.chap3;

//: c03:VowelsAndConsonants.java
// Demonstrates the switch statement.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import org.vito.simpletest.*;

public class VowelsAndConsonants {  // Ԫ���븨��
  static Test monitor = new Test();
  public static void main(String[] args) {
    for(int i = 0; i < 100; i++) {
      /*
       * Math.random()�����0��1֮���һ��ֵ��
       * ����ֻ�轫��������õ����ַ�Χ���Ͻ磨����Ӣ����ĸ�����������26����
       * �ټ�����Ϊƫ���������ַ�Χ�½磬�Ϳ��Եõ����ʵ������
       */
      char c = (char)(Math.random() * 26 + 'a');
      System.out.print(c + ": ");
      switch(c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': System.out.println("vowel");
                  break;
        case 'y':
        case 'w': System.out.println("Sometimes a vowel");
                  break;
        default:  System.out.println("consonant");
      }
      /*
      monitor.expect(new String[] {
    		  "%% [aeiou]: vowel|[yw]: Sometimes a vowel|" + 
    		  "[^aeiouyw]: consonant"}, Test.AT_LEAST);*/
    }    
  }
} ///:~
