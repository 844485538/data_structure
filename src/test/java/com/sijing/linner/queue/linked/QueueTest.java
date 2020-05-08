package com.sijing.linner.queue.linked;

import org.junit.Test;

import com.sijing.linear.queue.linked.Queue;


public class QueueTest {
	
	@Test
	public void pushTest() {
		Queue queue = new Queue();
		for (int i = 0; i < 10; i++){
			queue.push(i);
		}
		
		for(int i = 0; i < 20; i++){
			System.out.println(queue.pull());
		}
	}

}
