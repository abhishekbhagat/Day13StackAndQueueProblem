package com.bridgelabz.problemday13;
import org.junit.Test;
import org.junit.Assert;

public class MyStackTest {
	@Test
	public void given3NumberWhenAddedToStackShoulHaveLastAddedNode() {
		MyStack<Integer> stack = new MyStack<>();
		Integer a = 70, b = 30, c = 56;
		stack.push(a);
		stack.push(b);
		stack.push(c);
		stack.print();
		Assert.assertEquals(c, stack.peak());
	}
        @Test
	public void given3NumberWhenPoppedToStackShoulMatchWithLastAddedNode() {
		MyStack<Integer> stack = new MyStack<>();
		Integer a = 70, b = 30, c = 56;
		stack.push(a);
		stack.push(b);
		stack.push(c);
		stack.print();
		Assert.assertEquals(c, stack.pop());
	}
}
