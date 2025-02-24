package com.example.service_two.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageSender {

  private static final String ROUTING_KEY = "service_two.xyz";

  @Autowired
  private RabbitTemplate rabbitTemplate;

  public void send(String message) {
    log.info("Sending message: {} to queue", message);
    rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE_NAME, ROUTING_KEY, message);
  }

}
