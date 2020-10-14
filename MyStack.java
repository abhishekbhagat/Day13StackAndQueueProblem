package com.bridgelabz.problemday13;

public class MyStack<T> {
	public LinkedList<T> myLinkedList;

	public MyStack() {
		myLinkedList = new LinkedList<T>();
	}

	public void push(T data) {
		myLinkedList.insert(data);
	}

	public void print() {
		myLinkedList.show();
	}

	public T peak() {
		return myLinkedList.head.getData();
	}

        public T pop() {
		T topElement = myLinkedList.head.getData();
		myLinkedList.pop();
		return topElement;
	}

	public boolean isEmpty() {
		if (myLinkedList.head == null)
			return true;
		else
			return false;
	}

	public int size() {
		return myLinkedList.size();
	}
}
