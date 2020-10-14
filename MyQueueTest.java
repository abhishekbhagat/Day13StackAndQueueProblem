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
	
}
