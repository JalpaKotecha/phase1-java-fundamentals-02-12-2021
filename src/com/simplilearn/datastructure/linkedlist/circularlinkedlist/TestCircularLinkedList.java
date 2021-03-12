package com.simplilearn.datastructure.linkedlist.circularlinkedlist;


public class TestCircularLinkedList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "John Smith", 234545.34);
		Employee employee2 = new Employee(102, "Marry Smith", 934545.34);
		Employee employee3 = new Employee(103, "Will Clark", 434545.34);
		Employee employee4 = new Employee(104, "Tony Stark", 334545.34);
		Employee employee5 = new Employee(105, "Will Smith", 134545.34);
		Employee employee6 = new Employee(106, "Sachin", 134545.34);
		
		EmployeeCircularLinkedList list = new EmployeeCircularLinkedList();
		
		System.out.println("List size :: " + list.getSize());
		System.out.println("Is Empty list :: " + list.isEmpty());
		
		list.addToFront(employee1);
		list.addToFront(employee2);
		list.addToFront(employee3);
		
		list.prinList();
		
		System.out.println("List size :: " + list.getSize());
		System.out.println("Is Empty list :: " + list.isEmpty());
		
		System.out.println("--------------");
		list.removeFromFront();
		list.prinList();

	}

}
