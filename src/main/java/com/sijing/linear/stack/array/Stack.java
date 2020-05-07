package com.sijing.linear.stack.array;
/**
 * 栈
 *  数组实现
 */
public class Stack {

    private int[] data;

    private int size;

    public Stack (int capacity){
        this.data = new int[capacity];
        this.size = 0;
    }

    /**
     * 推送元素至栈中
     * @param data 元素
     * @throws Exception 栈满后添加元素报错
     */
    public void push(int element) throws Exception {
        if (size == this.data.length) {
            throw new Exception("Stack is full");
        }
        this.data[size] = element;
        this.size++;
    }

    /**
     * 从栈中推出元素
     * @return 元素
     * @throws Exception
     */
    public int pull() throws Exception {
        if (size == 0) {
            throw new Exception("any have element");
        }
        int element = this.data[size - 1];
        this.size--;
        return element;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i : this.data) {
            sb.append(i + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
