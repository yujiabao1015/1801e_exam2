package com.yujiabao.Person.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.yujiabao.common.domain.Person;
import com.yujiabao.common.utils.DateUtil;
import com.yujiabao.common.utils.RandomUtil;
import com.yujiabao.common.utils.StringUtil;

public class PersonTest {
	@Test
	public void test() {
		//拿到系统时间
		Calendar c = Calendar.getInstance();
		//为系统时间赋值为2012年1月1日
		c.set(2012, 0, 0);
		//产生一百个专家
		for(int i=0;i<100;i++) {
			Person p = new Person(BigInteger.valueOf(i+1), StringUtil.getZHName(), RandomUtil.random(1, 100), BigDecimal.valueOf(RandomUtil.getValue(300, 800, 2)), DateUtil.random(c.getTime(), new Date()));
			System.out.println(p);
		}
	}
}
