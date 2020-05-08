package com.sijing.linner.stack.linked;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sijing.linear.stack.linked.Stack;

public class StackTest {
	
	@Test
	public void pushTest() {
		Stack stack = new Stack();
		for (int i = 0; i < 10; i++){
			stack.push(i);
		}
		
		for(int i = 0; i < 20; i++){
			System.out.println(stack.pull());
		}
	}

}
