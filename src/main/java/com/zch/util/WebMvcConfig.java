/*package com.zch.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

*//**
* @author 张城辉
* @version 创建时间：2019年3月4日 上午11:31:37
* @ClassName 类名称
* @Description 类描述
*//*
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{
  @Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	  if(!registry.hasMappingForPattern("/static/**")){
		  registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/").setCacheControl(CacheControl.noCache());
	  }
	  super.addResourceHandlers(registry);
}
}
*/