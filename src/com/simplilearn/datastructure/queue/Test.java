package com.simplilearn.datastructure.queue;


public class Test {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "John Smith", 234545.34);
		Employee employee2 = new Employee(102, "Marry Smith", 934545.34);
		Employee employee3 = new Employee(103, "Will Clark", 434545.34);
		Employee employee4 = new Employee(104, "Tony Stark", 334545.34);
		Employee employee5 = new Employee(105, "Will Smith", 134545.34);
		
		ArrayQueue queue = new ArrayQueue(2);
		
		System.out.println("Queue size is : "+queue.size());
		
		queue.add(employee1);
		queue.add(employee2);
		
		System.out.println("Queue size is : "+queue.size());
		
		queue.add(employee3);
		queue.add(employee4);
		queue.add(employee5);

		queue.printQueue();
		
		System.out.println("---------------------");
		System.out.println("Queue front element before :->  "+queue.peek());
		System.out.println("Removed element :-> "+queue.remove());
		System.out.println("Queue front element after:-> "+queue.peek());
		
		System.out.println("---------------");
		queue.printQueue();
		
	}

}
