package com.company.stack;

public class StackTester {
  public static void main(String[] args) {
    //
      StackImpl stack = new StackImpl();
      for(int i=1; i<=10; i++){
          stack.push(i);
      }
    System.out.println("Size of the stack after pushing 10 elements: "+stack.getSize());
    System.out.println("Result of popping: "+stack.pop());
    System.out.println("Size after popping: "+stack.getSize());
  }
}
