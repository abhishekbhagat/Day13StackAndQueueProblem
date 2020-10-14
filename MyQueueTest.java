package com.bridgelabz.problemday13;

import org.junit.Test;
import org.junit.Assert;

public class MyQueueTest {

	@Test
	public void given3NumberWhenAddedToQueueShoulHaveAddedToFrontNode() {
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		Integer a = 56, b = 30, c = 70;
		myQueue.enqueue(a);
		myQueue.enqueue(b);
		myQueue.enqueue(c);
	}
     	@Test
	public void given3NumberWhenPoppedToQueueShoulMatchWithFirstNode() {
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		Integer a = 70, b = 30, c = 56;
		myQueue.enqueue(a);
		myQueue.enqueue(b);
		myQueue.enqueue(c);
		Assert.assertEquals(a, myQueue.dequeue());
	}
}
