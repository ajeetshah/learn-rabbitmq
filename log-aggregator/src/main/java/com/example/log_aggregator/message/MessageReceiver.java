package com.example.log_aggregator.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageReceiver {

  public static final String QUEUE_SERVICE_ONE = "service_one";
  public static final String QUEUE_SERVICE_TWO = "service_two";
  public static final String QUEUE_SERVICE_THREE = "service_three";

  @RabbitListener(queues = {QUEUE_SERVICE_ONE})
  public void listenServiceOne(String message) {
    log.info("Message from Service One: {}", message);
  }

  @RabbitListener(queues = {QUEUE_SERVICE_TWO})
  public void listenServiceTwo(String message) {
    log.info("Message from Service Two: {}", message);
  }

  @RabbitListener(queues = {QUEUE_SERVICE_THREE})
  public void listenServiceThree(String message) {
    log.info("Message from Service Three: {}", message);
  }

}
