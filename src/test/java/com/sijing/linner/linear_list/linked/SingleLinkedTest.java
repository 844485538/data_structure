package com.sijing.linner.linear_list.linked;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.sijing.linear.linear_list.linked.SingleLinked;

// 指定@Test方法按按字母排序
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingleLinkedTest {
	
	
	SingleLinked singleLinked;
	
	/**
	 * 每个@Test方法执行前都构建一个包含20个元素的单链表
	 */
	@Before
	public void before() {
		singleLinked = new SingleLinked(0);
		// 尾插法
		for (int i = 1; i < 10; i++) {
			singleLinked.tailInsert(i);
		}
		for (int i = 10; i < 20; i++) {
			singleLinked.headInsert(i);
		}
	}

	/**
	 * 测试根据索引获取元素
	 */
	@Test
	public void a_getTest() {
		for (int i = 0; i < 20; i++) {
			System.out.println(singleLinked.get(i));
		}
	}
	
	/**
	 * 根据索引修改元素值
	 */
	@Test
	public void b_updateTest() {
		singleLinked.update(19, 9000);
		System.out.println(singleLinked.toString());
	}
	
	/**
	 * 按索引删除元素
	 */
	@Test
	public void c_delteTest() {
		singleLinked.delete(18);
		System.out.println(singleLinked.toString());
	}

}
