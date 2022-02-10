package com.acme.basic;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    System.out.println("Hi");
    new HelloWorld().sayHello();
  }
}
