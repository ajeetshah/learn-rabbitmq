package com.example.service_one.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

  @RabbitListener(queues = MessageConfig.QUEUE_NAME)
  public void listen(String message) {
    System.out.printf("Received: %s%n", message);
  }

}