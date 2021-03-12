package com.simplilearn.datastructure.queue;


public class ArrayQueue {

	public int front;
	public int rear;
	private Employee[] queue;

	// create a constructor to create a queue.
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	// add
	public void add(Employee employee) {
		// queue if full
		if (rear == queue.length) {
			// double queue size
			Employee[] newArr = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr;
		}
		// add element in queue
		queue[rear++] = employee;
	}
	
	// remove
	public Employee remove() {
		if(size()==0) {
			rear = 0;
			front = 0;
			return null;
		}
		Employee removedElm = queue[front];
		queue[front] = null;
		front++;
		return removedElm;
	}
	
	// size
	public int size() {
		return rear - front;
	}
	
	// peek
	public Employee peek() {
		if(size()==0) {
			rear = 0;
			front = 0;
			return null;
		}
		return queue[front];
	}
	
	// print queue.
	public void printQueue() {
		System.out.println("Front -> ");
		for (int i = front; i < rear; i++) {
			System.out.println(queue[i]);
		}
		System.out.println(" <- Rear ");
	}
}
