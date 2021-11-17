package com.bridgelabz;

public class Stack {
	
	private static final int MAX = 10;
	
	private int [] arr;
	private int top;
	
	public Stack() {
		arr = new int[MAX];
		top = -1;
	}
	
	public Stack(int length) {
		this.arr = new int[length];
		top = -1;	
	}
	
	public boolean push(int data) {
		if(isFull()) {
			System.out.println("Stack is Overflow");
			return false;
		}
		arr[++top] = data;
		System.out.println("Pushed data in to Stack");
		return true;
	}

	public boolean isFull() {
		return top >= arr.length-1;
	}
		
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is underflow");
			return 0;
		}
		int data = arr[top--];
		return data;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is underflow");
			return 0;
		}
		int data = arr[top];
		return data;
		
	}

	private boolean isEmpty() {
		return top < 0;
	}
	
	public int size(){
		if(isEmpty()) {
			return 0;
		}		
		return ++top;
	}
}
