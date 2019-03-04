package com.zch.controller;


import javax.jms.Destination;

import org.apache.activemq.broker.region.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author 张城辉
* @version 创建时间：2019年3月5日 上午11:03:47
* @ClassName 类名称
* @Description 类描述 生产者controller
*/
@RestController
public class ProducerController { 
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @RequestMapping("/sendMsg")
    public String sendMsg(Destination destination,String msg){
      this.jmsMessagingTemplate.convertAndSend(destination, msg);
      return "生产完成";
    }
}
