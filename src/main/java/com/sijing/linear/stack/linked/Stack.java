package com.sijing.linear.stack.linked;

import com.sijing.entity.BothwayLinkedNode;

/**
 * 双向链表实现 栈
 * @author farbun
 *
 */
public class Stack {
	
	@SuppressWarnings("unused")
	private BothwayLinkedNode head;
	
	private BothwayLinkedNode tail;
	
	private int size;
	
	/**
	 * 构建空的栈
	 */
	public Stack (){
		this.size = 0;
	}
	
	public void push(int data){
		BothwayLinkedNode node = new BothwayLinkedNode(data);
		if (this.size == 0){
			this.head = node;
			this.tail = node;
			this.size++;
		} else {
			BothwayLinkedNode lastNode = this.tail;
			lastNode.setNextNode(node);
			node.setPreviousNode(lastNode);
			this.tail = node;
			this.size++;
		}
	}
	
	public int pull(){
		if (this.size == 0){
			throw new IndexOutOfBoundsException("Do not have any element");
		}
		BothwayLinkedNode node = this.tail;
		this.tail = this.tail.getPreviousNode();
		this.size--;
		return node.getData();
	}
	

}
