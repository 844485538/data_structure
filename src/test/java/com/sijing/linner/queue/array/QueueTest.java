package com.sijing.linner.queue.array;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sijing.linear.queue.array.Queue;

public class QueueTest {

	@Test
	public void pushTest() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 10; i++){
			queue.push(i);
		}
		
		for(int i = 0; i < 20; i++){
			System.out.println(queue.pull());
		}
	}

}
