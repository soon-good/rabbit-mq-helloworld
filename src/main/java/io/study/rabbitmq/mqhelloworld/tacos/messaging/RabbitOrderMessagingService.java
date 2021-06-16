package io.study.rabbitmq.mqhelloworld.tacos.messaging;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitOrderMessagingService{

//    private RabbitTemplate rabbitTemplate;
//
//    @Autowired
//    public RabbitOrderMessagingService(RabbitTemplate rabbitTemplate){
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//    public void sendOrder(Order order){
//        MessageConverter converter = rabbitTemplate.getMessageConverter();
//        MessageProperties props = new MessageProperties();
//        Message message = converter.toMessage(order, props);
//        rabbitTemplate.send("tacocloud.order", message);
//    }
}
