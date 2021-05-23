package com.algorithms;

import java.util.Stack;

/***
 * 
 * Implement queue using stacks
 * 
 * @author Amod
 *
 */

public class QueueWithStack {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	public void enqueue(int value) {
		stack1.add(value);
	}

	public int dequeue() {

		while (!stack1.isEmpty()) {
			for (int i = 0; i < stack1.size(); i++) {
				stack2.add(stack1.pop());
			}
		}

		return stack2.pop();
	}
	
	public static void main(String[] args) {
		QueueWithStack q1 = new QueueWithStack();
		q1.enqueue(5);
		q1.enqueue(10);
		q1.enqueue(15);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
	}

}
