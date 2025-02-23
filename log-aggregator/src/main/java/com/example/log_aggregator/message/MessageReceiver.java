package com.example.log_aggregator.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

  public static final String QUEUE_SERVICE_ONE = "service_one";
  public static final String QUEUE_SERVICE_TWO = "service_two";
  public static final String QUEUE_SERVICE_THREE = "service_three";

  @RabbitListener(queues = {QUEUE_SERVICE_ONE, QUEUE_SERVICE_TWO, QUEUE_SERVICE_THREE})
  public void listen(String message) {
    System.out.printf("Message: %s%n", message);
  }

}
