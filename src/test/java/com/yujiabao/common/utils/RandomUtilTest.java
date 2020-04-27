package com.yujiabao.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testGetValue() {
		System.out.println(RandomUtil.getValue(300, 800, 2));
	}

	@Test
	public void testRandom() {
		System.out.println(RandomUtil.random(2, 5));
	}

}
