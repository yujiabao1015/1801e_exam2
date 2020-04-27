package com.yujiabao.common.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
/**
 * 专家实体类
 * @ClassName: Person 
 * @Description: TODO
 * @author: www17
 * @date: 2020年4月27日 上午10:32:40
 */
public class Person {
	private BigInteger id;
	private String name;
	private Integer age;
	private BigDecimal money;
	private Date date;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person() {
		super();
	}
	public Person(BigInteger id, String name, Integer age, BigDecimal money, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.money = money;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", money=" + money + ", date=" + date + "]";
	}
	
	
}
