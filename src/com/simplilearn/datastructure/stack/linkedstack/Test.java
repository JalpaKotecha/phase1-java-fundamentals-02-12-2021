package com.simplilearn.datastructure.stack.linkedstack;

public class Test {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "John Smith", 234545.34);
		Employee employee2 = new Employee(102, "Marry Smith", 934545.34);
		Employee employee3 = new Employee(103, "Will Clark", 434545.34);
		Employee employee4 = new Employee(104, "Tony Stark", 334545.34);
		Employee employee5 = new Employee(105, "Will Smith", 134545.34);
		
		LinkedStack stack = new LinkedStack();

		System.out.println("Stack size :: "+stack.size());
		System.out.println("Stack is empty :: "+stack.isEmpty());
		
		stack.push(employee1);
		stack.push(employee2);
		
		System.out.println("Stack size :: "+stack.size());
		System.out.println("Stack is empty :: "+stack.isEmpty());
		
		stack.printStack();
		System.out.println("-------------------");
		stack.push(employee3);
		stack.push(employee4);
		stack.printStack();
		
		System.out.println("-------------------");
		System.out.println("Stack Top element before : -> "+stack.peak());
		System.out.println("Removed element : -> "+stack.pop());
		System.out.println("Stack Top element after : -> "+stack.peak());
		
	}

}
