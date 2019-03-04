package com.zch.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 张城辉
 * @version 创建时间：2019年3月1日 下午5:20:04
 * @ClassName 类名称
 * @Description 类描述
 */

// 表示是一个读取配置的类
@Configuration
// 指定配置的一些属性,其中的prefix表示前缀
@ConfigurationProperties(prefix = "com.zch.source")
// 指定所读取的配置文件的路径
@PropertySource(value = "classpath:resource.properties")
public class Resources {
	private String name;
	private int age;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Resources(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public Resources() {
		super();
	}

}
