package com.sijing.entity;

/**
 * 双向链节点
 */
public class BothwayLinkedNode {
	
	private int data;
	
	/**
	 * 前一个节点
	 */
	private BothwayLinkedNode previousNode;
	
	/**
	 * 后一个节点
	 */
	private BothwayLinkedNode nextNode;

	public BothwayLinkedNode(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BothwayLinkedNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(BothwayLinkedNode previousNode) {
		this.previousNode = previousNode;
	}

	public BothwayLinkedNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(BothwayLinkedNode nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}
