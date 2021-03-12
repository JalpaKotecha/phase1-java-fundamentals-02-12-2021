package com.simplilearn.datastructure.linkedlist.circularlinkedlist;


public class EmployeeCircularLinkedList {

	private EmployeeNode head;
	private int size;
	private EmployeeNode tail;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	// add to front
	public void addToFront(Employee employee) {
		// create a node
		EmployeeNode node = new EmployeeNode(employee);
		
		//if list is empty
		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}		
		tail = node;
		// for circular linked list tail next node -> head
		tail.setNext(head);
		size++;
	}
	
	public EmployeeNode removeFromFront() {	
		if(isEmpty()) {
			return null;
		}
	
		EmployeeNode removedNode = head;
		// change head ref
		head = head.getNext();
		size--;
		
		removedNode.setNext(null);
		tail.setNext(head);
		return removedNode;
	}
	
	public void prinList() {
		EmployeeNode current = head;
		if(current == null) {
			System.out.println("Circular Linked list is empty");
		} else {
			System.out.println("Head -> ");
			do {
				if(current != null) {
					System.out.print(" -> " + current.getData());
					current = current.getNext();
				}				
				
			} while(current != head);
		}
		
	}

}
