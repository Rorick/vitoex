package org.vito.chap3;

//: c03:Equivalence.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import org.vito.simpletest.*;

public class Equivalence {
  static Test monitor = new Test();
  public static void main(String[] args) {
    Integer n1 = new Integer(47);
    Integer n2 = new Integer(47);
    //==和!=比较的是对象的引用
    System.out.println(n1 == n2);
    System.out.println(n1 != n2);
    monitor.expect(new String[] {
      "false",
      "true"
    });
  }
} ///:~
