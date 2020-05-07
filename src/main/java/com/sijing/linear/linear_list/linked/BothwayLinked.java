package com.sijing.linear.linear_list.linked;

public class BothwayLinked {

	private Node head;

	private int size;

	public BothwayLinked(int data){
		this.head = new Node(data);
		this.size++;
	}

	/**
	 * 根据索引获取元素
	 * @param index
	 * @return
	 */
	public int get(int index){
		return this.getNode(index).getData();
	}

	private Node getNode(int index){
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("索引超出范围");
		}
		Node node = this.head;
		for (int i = 1; i <= index; i++){
			node = node.getNextNode();
		}
		return node;
	}

	/**
	 * 头插法
	 * @param data
	 */
	public void headInsert(int data){
		Node node = new Node(data);
		node.setNextNode(this.head);
		this.head = node;
		this.size++;
	}

	/**
	 * 尾插法
	 * @param data
	 */
	public void tailInsert(int data){
		Node node = new Node(data);
		Node lastNode = this.getNode(this.size - 1);
		lastNode.setNextNode(node);
		node.setPreviousNode(lastNode);
		this.size++;
	}

	/**
	 * 根据索引修改数据
	 * @param index
	 * @param data
	 */
	public void update(int index, int data){
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("索引超出范围");
		}
		this.getNode(index).setData(data);
	}

	/**
	 * 根据索引移除元素
	 * @param index
	 */
	public void delete(int index) {
		// 判断索引是否超出范围
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("索引超出范围");
		}
		Node previousNode = this.getNode(index - 1);
		if (index == (this.size - 1)) {
			previousNode.setNextNode(null);
		} else {
			previousNode.setNextNode(this.getNode(index + 1));
		}
		this.size--;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < this.size; i++){
			sb.append(this.get(i));
			sb.append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}

	class Node {

		private int data;
		private Node previousNode;
		private Node nextNode;

		public Node(int data){
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getPreviousNode() {
			return previousNode;
		}

		public void setPreviousNode(Node previousNode) {
			this.previousNode = previousNode;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
	}

}

