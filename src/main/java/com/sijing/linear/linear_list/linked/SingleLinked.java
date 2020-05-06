package com.sijing.linear.linear_list.linked;

/**
 * @description 链式结构实现线性表：单链表
 * 
 * @author li
 *
 */
public class SingleLinked {

	/**
	 * 头指针
	 */
	private Node head;

	/**
	 * 对象包含的元素数量
	 */
	private int size;

	public SingleLinked(Node head) {
		this.head = head;
		this.size++;
	}

	/**
	 * 头插法
	 * @param node
	 */
	public void headInsert(Node node) {
		Node next = this.head;
		node.setNext(next);
		this.head = node;
		this.size++;
	}

	/**
	 * 尾插法
	 * @param node
	 */
	public void tailInsert(Node node) {
		Node thisNode = this.head;
		while (true) {
			if (thisNode.getNext() != null) {
				thisNode = thisNode.getNext();
			} else {
				thisNode.setNext(node);
				this.size++;
				break;
			}
		}
	}

	/**
	 * 根据下标获取元素
	 * @param index
	 * @return
	 */
	public Node get(int index) {
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException();
		}
		Node result = this.head;
		for (int i = 1; i <= index; i++) {
			result = result.getNext();
		}
		return result;
	}

	/**
	 * 根据下标删除元素
	 * @param index
	 * @return
	 */
	public Node delete(int index) {
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException();
		}
		Node beforeNode = this.get(index - 1);
		Node node = this.get(index);
		Node AfterNode = this.get(index + 1);
		beforeNode.setNext(AfterNode);
		return node;
	}

	/**
	 * 根据下标修改元素
	 * @param index
	 * @param data
	 */
	public void update(int index, int data) {
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException();
		}
		this.get(index).setData(data);
	}
}



class Node {

	private int data;

	private Node next;

	public Node (int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
