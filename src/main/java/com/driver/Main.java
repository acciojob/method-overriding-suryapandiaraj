package com.driver;

public class Main {
  B obj = new B();
  System.out.print(obj.meth());
  class A{
    String meth(){
      return "Invoking method from class A";
    }
  }
  class B extends A{
    String meth(){
      return "Method is overridden in Extendend class B";
    }
  }
}
