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

	public SingleLinked(int data) {
		this.head = new Node(data);
		this.size++;
	}

	/**
	 * 头插法
	 * @param node
	 */
	public void headInsert(int data) {
		Node head = this.head;
		Node node = new Node(data);
		node.setNext(head);
		this.head = node;
		this.size++;
	}

	/**
	 * 尾插法
	 * @param node
	 */
	public void tailInsert(int data) {
		Node thisNode = this.head;
		while (true) {
			if (thisNode.getNext() != null) {
				thisNode = thisNode.getNext();
			} else {
				thisNode.setNext(new Node(data));
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
	private Node getNode(int index) {
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("索引超出范围");
		}
		Node result = this.head;
		for (int i = 1; i <= index; i++) {
			result = result.getNext();
		}
		return result;
	}
	
	/**
	 * 根据下标获取元素中的数据
	 * @param index
	 * @return
	 */
	public int get(int index) {
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("索引超出范围");
		}
		return this.getNode(index).getData();
	}

	/**
	 * 根据下标删除元素
	 * @param index
	 * @return
	 */
	public Node delete(int index) {
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("索引超出范围");
		}
		Node beforeNode = this.getNode(index - 1);
		Node node = this.getNode(index);
		Node AfterNode = this.getNode(index + 1);
		beforeNode.setNext(AfterNode);
		this.size--;
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
			throw new IndexOutOfBoundsException("索引超出范围");
		}
		this.getNode(index).setData(data);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node node = this.head;
		sb.append("[");
		while(true) {
			sb.append(node.getData());
			sb.append(",");
			if (node.getNext() == null) {
				break;
			} else {
				node = node.getNext();
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}

/**
 * 节点类，不可暴露
 * 
 * @author li
 *
 */
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
