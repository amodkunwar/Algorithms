package com.algorithms;

import java.util.LinkedList;
import java.util.Queue;

/***
 * 
 * @author Amod Kunwar
 *
 */
public class Stack {

	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();
	Queue<Integer> queue3 =  null;

	/***
	 * 
	 * @param value
	 */
	public void push(int value) {
		queue1.add(value);
	}

	/***
	 * 
	 * @return
	 */
	public int pop() {

		int temp = 0;
		if (queue1.isEmpty()) {
			return -1;
		}
		while (queue1.size() != 1) {
			queue2.add(queue1.remove());
		}
		if (queue1.size() == 1) {
			temp = queue1.remove();
		}
		
		queue3 = queue1;
		queue1 = queue2;
		queue2 = queue3;
		
		return temp;
	}

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}