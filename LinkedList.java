package com.bridgelabz.problemday13;
public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * uc1
	 * 
	 * @param data
	 */
	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	/**
	 * uc3
	 * 
	 * @param data
	 */
	public void append(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	/**
	 * uc4
	 * 
	 * @param newKey
	 * @param key
	 */
	public void insertNumberAfterGivenNumber(T newKey, T key) {
		Node<T> node = head;
		Node<T> temp;
		Node<T> newnode = new Node<T>(newKey);
		while (node != null) {
			if (node.getData() == key)
				break;
			node = node.getNext();
		}
		temp = node.getNext();
		node.setNext(newnode);
		newnode.setNext(temp);
	}

	/**
	 * uc5
	 * 
	 */
	public void pop() {
		Node<T> node = head;
		head = node.getNext();
		node.setNext(null);
	}
	/**
	 * uc6
	 * 
	 */
	public void popLast() {
		Node<T> node=head;
		while(node.getNext()!=tail) {
			node=node.getNext();
		}
		node.setNext(null);
		tail=node;
	}
	/**
	 * uc7
	 * @param value
	 * @return
	 */
	public boolean findNodeWithValue(T value) {
		Node<T> node=head;
		while(node!=null) {
			if(node.getData()==value)
				return true;
			node=node.getNext();
		}
		return false;
	}
	/**
	 * uc8
	 * @param newKey
	 * @param key
	 */
	public void insertNumberAfterGivenNodeKey(T newKey, T key) {
		Node<T> node = head;
		Node<T> temp;
		Node<T> newnode = new Node<T>(newKey);
		while (node != null) {
			if (node.getData() == key)
				break;
			node = node.getNext();
		}
		temp = node.getNext();
		node.setNext(newnode);
		newnode.setNext(temp);
	}
	/**
	 * uc9
	 * @param key
	 */
	public void deleteSelectedNode(T key) {
		Node<T> node=head;
		Node<T> prevNode=null;
		while(node!=null) {
			if(node.getData()==key)
				break;
			prevNode=node;
			node=node.getNext();
		}
		if(prevNode==null) {
			head=head.getNext();
		}
		else
		{
		    prevNode.setNext(node.getNext());
		    node.setNext(null);
		}
	}
	/**
	 * u2
	 * uc10
	 * @param data
	 */
	public void add(T data) {
		Node<T> newNode=new Node<T>(data);
		if(head==null && tail ==null) {
			head=newNode;
			tail=newNode;
		}
		else
		{
			Node<T> temp=null,prevNode=null;
			temp=head;
			while(temp!=null) {
				if(sort(temp,newNode)>0) {
					break;
				}
				prevNode=temp;
				temp=temp.getNext();
			}
			if(temp==head) {
				newNode.setNext(temp);
				head=newNode;
			}
			else if(temp==null) {
				prevNode.setNext(newNode);
				tail=newNode;
			}
			else
			{
			prevNode.setNext(newNode);
			newNode.setNext(temp);
		    }
	    }
	}
	private  int sort(Node<T> temp, Node<T> newNode) {
		return ((Comparable) temp.getData()).compareTo(newNode.getData());
	}
	public void show() {
		Node<T> node = head;
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
	public int size() {
		int size=0;
		Node<T> node = head;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		return size;
	}
}