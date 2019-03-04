package com.zch.activityMqTest;


import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
* @author 张城辉
* @version 创建时间：2019年3月5日 上午9:44:57
* @ClassName 类名称
* @Description 类描述 消息生产者
*/
@Component
public class JMSProducer {
	@Autowired
   private JmsTemplate jmsTemplate;
	public void sendMessage(Destination destination,String message) {
          this.jmsTemplate.convertAndSend(destination, message);
	}
}
