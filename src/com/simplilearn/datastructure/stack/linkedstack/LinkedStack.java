package com.simplilearn.datastructure.stack.linkedstack;

import java.util.LinkedList;
/**
 * Stack Implementation based on LinkedList
 *
 */
public class LinkedStack {
	
	private LinkedList<Employee> stack;

	// create stack
	public LinkedStack(){
		stack = new LinkedList<Employee>();
	}
	
	// push
	public void push(Employee employee) {
		stack.push(employee);
	}
	// pop
	public Employee pop() {
		return stack.pop();
	}
	
	// peak
	public Employee peak() {
		return stack.peek();
	}
	// size
	public int size() {
		return stack.size();
	}
	
	// is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	// print stack;
	public void printStack() {
		System.out.println("Top :-> ");
		for(Employee emp : stack) {
			System.out.println(emp);
		}
	}
	
}
