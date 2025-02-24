package com.example.log_aggregator.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

  public static final String QUEUE_SERVICE_ONE = "service_one";
  public static final String QUEUE_SERVICE_TWO = "service_two";
  public static final String QUEUE_SERVICE_THREE = "service_three";

  @RabbitListener(queues = {QUEUE_SERVICE_ONE})
  public void listenServiceOne(String message) {
    System.out.printf("Message from Service One: %s%n", message);
  }

  @RabbitListener(queues = {QUEUE_SERVICE_TWO})
  public void listenServiceTwo(String message) {
    System.out.printf("Message from Service Two: %s%n", message);
  }

  @RabbitListener(queues = {QUEUE_SERVICE_THREE})
  public void listenServiceThree(String message) {
    System.out.printf("Message from Service Three: %s%n", message);
  }

}
