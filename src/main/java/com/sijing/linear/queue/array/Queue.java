package com.sijing.linear.queue.array;

public class Queue {
	
	private int[] data;
	
	private int pushIndex;
	
	private int pullIndex;
	
	private int size;
	
	public Queue(int capacity) {
		data = new int[capacity];
		this.pullIndex = 0;
		this.pushIndex = 0;
		this.size = 0;
	}
	
	public void push(int element) {
		if (this.size == this.data.length) {
            throw new IndexOutOfBoundsException("Queue is full");
        }
		data[pushIndex] = element;
		pushIndex++;
		this.size++;
	}
	
	public int pull() {
		if (this.size == 0) {
            throw new IndexOutOfBoundsException("any elemetn in Queue");
        }
		int result = data[pullIndex];
		pullIndex++;
		this.size--;
		return result;
	}

}
