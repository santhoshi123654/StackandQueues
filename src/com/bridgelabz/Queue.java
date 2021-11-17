package com.bridgelabz;

public class Queue {
	private int [] arr;
	private int front;
	private int rear;
	private int capacity;
	private int count;

	public Queue(int size) {
		this.arr = new int[size];
		this.capacity = size;
		this.front = 0;
		this.rear = -1;
	
}
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is Overflow");
			return;
		}
		System.out.println("Inserting the data into Queue");
		rear = (rear+1) % capacity;
		System.out.println("Rear :" +rear);
		arr[rear] = data;
		count++;	
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is underflow");
			return;
		}
		System.out.println("Removing element from Queue");
		front = (front + 1)% capacity;
		System.out.println(front);
		count--;
		
	}
	
	private boolean isEmpty() {
		return size() == 0;
	}
	
	private boolean isFull() {
		return size() == capacity;
	}
	
	private int size() {
		return count;
	}

}
