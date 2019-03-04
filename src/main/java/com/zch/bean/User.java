package com.zch.bean;

import java.io.Serializable;

/**
 * @author 张城辉
 * @version 创建时间：2019年3月1日 下午1:36:41
 * @ClassName 类名称
 * @Description 类描述
 */
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String passWord;
	private Integer age1;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public Integer getAge1() {
		return age1;
	}

	public void setAge1(Integer age1) {
		this.age1 = age1;
	}

	public User() {
		super();
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public User(Integer id, String name, String passWord, Integer age1) {
		super();
		this.id = id;
		this.name = name;
		this.passWord = passWord;
		this.age1 = age1;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passWord=" + passWord + ", age1=" + age1 + "]";
	}

}
