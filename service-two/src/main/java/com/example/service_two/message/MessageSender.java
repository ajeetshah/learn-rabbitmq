package com.example.service_two.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

  private static final String ROUTING_KEY = "service_two.xyz";

  @Autowired
  private RabbitTemplate rabbitTemplate;

  public void send(String message) {
    rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE_NAME, ROUTING_KEY, message);
  }

}
