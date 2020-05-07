package com.sijing.linner.linear_list.linked;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sijing.linear.linear_list.linked.BothwayLinked;
import com.sijing.linear.linear_list.linked.SingleLinked;

public class BothwayLinkedTest {
	
	BothwayLinked bothwayLinked;
	
	/**
	 * 每个@Test方法执行前都构建一个包含20个元素的双向链表
	 */
	@Before
	public void before() {
		bothwayLinked = new BothwayLinked(0);
		// 尾插法
		for (int i = 1; i < 10; i++) {
			bothwayLinked.tailInsert(i);
		}
		for (int i = 10; i < 20; i++) {
			bothwayLinked.headInsert(i);
		}
		System.out.println("构建后的双向链表：" + bothwayLinked);
	}

	/**
	 * 测试根据索引获取元素
	 */
	@Test
	public void a_getTest() {
		for (int i = 0; i < 20; i++) {
			System.out.println(bothwayLinked.get(i));
		}
	}
	
	/**
	 * 根据索引修改元素值
	 */
	@Test
	public void b_updateTest() {
		bothwayLinked.update(19, 9000);
		System.out.println("修改双向链表：" + bothwayLinked.toString());
	}
	
	/**
	 * 按索引删除元素
	 */
	@Test
	public void c_delteTest() {
		bothwayLinked.delete(18);
		System.out.println("删除双向链表的一个元素：" + bothwayLinked.toString());
	}

}
