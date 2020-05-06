//package com.sijing.linear.sequence_list.linked;
//
//public class SequenceByLinked {
//
//    private int data;
//
//    private node next;
//
//    private int size;
//
//    public SequenceByLinked(int data) {
//        this.data = data;
//        this.next = null;
//        this.size = 0;
//    }
//
//    public NodeSequenceByLinked(int index){
//        // 检查索引是否合法
//        if(index < 0 || index > size){
//            throw new IndexOutOfBoundsException();
//        }
//        SequenceByLinked node = this;
//        for (int i = 0; i < index; i++){
//            node = node.next;
//        }
//        return node;
//    }
//
//    public void insert(int data){
//    	SequenceByLinked insertNode = new SequenceByLinked(data);
//        SequenceByLinked lastNode = get(this.size);
//        lastNode.next = insertNode;
//        this.size ++;
//    }
//
//    public int delete(int index){
//        // 检查索引是否合法
//        if(index < 0 || index > size){
//            throw new IndexOutOfBoundsException();
//        }
//        if (index == 0) {
//            int data = this.data;
//            this.data = 0;
//            this.size = 0;
//            this.next = null;
//            return data;
//        }
//        if (index == size){
//            Node beforeDeleteNode = get(index - 1);
//            Node deleteNode = get(index);
//            beforeDeleteNode.next = null;
//            this.size--;
//            return deleteNode.data;
//        }
//        Node beforeDeleteNode = get(index - 1);
//        Node deleteNode = get(index);
//        Node afterDeleteNOde = get(index + 1);
//        beforeDeleteNode.next = afterDeleteNOde;
//        this.size--;
//        return deleteNode.data;
//    }
//
//    @Override
//    public String toString() {
//        StringBuffer sb = new StringBuffer();
//        sb.append("[ ");
//        Node node = this;
//        sb.append(node.data);
//        sb.append(",");
//        while (node.next != null){
//            node = node.next;
//            sb.append(node.data);
//            sb.append(",");
//        }
//        sb.deleteCharAt(sb.length() - 1);
//        sb.append(" ]");
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        Node node = new Node(0);
//        for(int i = 1;i<21;i++){
//            node.insert(i);
//        }
//        System.out.println(node.delete(0));
//        System.out.println(node.toString());
//    }
//}
