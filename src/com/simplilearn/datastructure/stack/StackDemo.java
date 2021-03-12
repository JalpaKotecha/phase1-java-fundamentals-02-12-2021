package com.simplilearn.datastructure.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		// Stack : work LIFO
		stack.push(12);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(13);
		stack.push(13);

		System.out.println(stack);
		
		// top of the stack
		System.out.println("Top :"+stack.peek());
		
		System.out.println("Removed Element :"+ stack.pop());
	}

}
