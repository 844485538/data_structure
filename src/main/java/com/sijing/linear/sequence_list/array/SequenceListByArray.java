package com.sijing.linear.sequence_list.array;
/**
 * 数组实现顺序表
 */
public class SequenceListByArray {

    private int[] data;

    /**
     * 数组中的元素数量
     */
    private int size;


    public SequenceListByArray(int capacity) {
        data = new int[capacity];
        this.size = 0;
    }

    /**
     * 根据下标获取指定索引的元素
     *      时间复杂度：O(1)
     * @param index 获取元素的位置
     * @return  如果索引位置未设置元素，则返回默认空值：0
     */
    public int get(int index) {
        return this.data[index];
    }


    /**
     * 尾部插入
     *      时间复杂度：O(1)
     * @param element 插入的元素
     */
    public void insert(int element) {
        // 容量不足时，进行扩容
        if (this.size == this.data.length) {
            this.resize();
        }
        this.data[this.size] = element;
        this.size++;
    }

    /**
     * 指定插入位置插入
     *      时间复杂度：O(n)
     * @param index 插入的位置
     * @param element   插入的元素
     */
    public void insert(int index, int element) {
        // 判断索引是否超出范围
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("指定的索引位置超出数组的索引范围");
        }
        // 容量不足时，进行扩容
        if (this.size == this.data.length) {
            this.resize();
        }
        for (int i = this.size; i > index; i--) {
            this.data[i] = this.data[i-1];
        }
        this.data[index] = element;
        this.size++;
    }



    /**
     * 更新数组
     *       时间复杂度：O(1)
     * @param index 插入的位置
     * @param element 插入的元素
     */
    public void  update(int index, int element) {
        this.data[index] = element;
    }

    /**
     * 删除元素
     *      时间复杂度：O(n)
     * @param index 删除元素的位置
     */
    public int delete(int index) {
        // 判断索引是否超出范围
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("指定的索引位置超出数组的索引范围");
        }
        int deleteElement = this.data[index];
        for (int i = index; i < this.size; i++) {
            // 最后以为设置为默认值
            if (i == this.size - 1){
                this.data[i] = 0;
            } else {
                this.data[i] = this.data[i + 1];
            }
        }
        this.size--;
        return deleteElement;
    }


    /**
     * 对数组进行扩容，默认扩大一倍容量
     *        时间复杂度：O(n)
     */
    private void resize() {
        int[] newArray = new int[this.data.length * 2];
        for(int i = 0; i< this.data.length; i++) {
            newArray[i] =  this.data[i];
        }
        this.data = newArray;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[ ");
        for (int i : this.data) {
            sb.append(i + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(" ]");
        return sb.toString();
    }
    
}
