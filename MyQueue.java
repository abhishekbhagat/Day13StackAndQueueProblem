package com.bridgelabz.problemday13;

public class MyQueue<T> {
  private LinkedList<T> myLinkedList;
  public MyQueue() {
	  myLinkedList=new LinkedList<T>();
  }
  public void enqueue(T data) {
	  myLinkedList.append(data);
  }

  public void print() {
	  myLinkedList.show();
  }
  public boolean isEmpty() {
	  if(myLinkedList.head==null)
		  return true;
	  else
		  return false;
  }
  public int  size() {
	   return myLinkedList.size();
  }
}
