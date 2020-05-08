package com.sijing.linear.queue.linked;

import com.sijing.entity.BothwayLinkedNode;

public class Queue {
	
	private BothwayLinkedNode firstNode;
	
	private BothwayLinkedNode lastNode;
	
	private int size;
	
	public Queue(){
		this.size = 0;
	}
	
	public void push(int element){
		BothwayLinkedNode node = new BothwayLinkedNode(element);
		if (this.size == 0){
			this.firstNode = node;
			this.lastNode = node;
		} else {
			BothwayLinkedNode lastNode = this.lastNode;
			node.setPreviousNode(lastNode);
			lastNode.setNextNode(node);
			this.lastNode = node;
		}
		this.size++;
	}
	
	public int pull() {
		if (this.size == 0) {
            throw new IndexOutOfBoundsException("any elemetn in Queue");
        }
		BothwayLinkedNode node = this.firstNode;
		this.firstNode = node.getNextNode();
		this.size--;
		return node.getData();
	}
	
	

}
