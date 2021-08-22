package com.company.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        StackImpl<Integer> stack = new StackImpl<>();

        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack);

        int x = stack.pop();
        System.out.println(x);
        System.out.println(stack);



    }
}
