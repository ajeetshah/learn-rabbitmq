package com.example.service_one;

import java.util.concurrent.TimeUnit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Autowired
  private MessageReceiver messageReceiver;

  @GetMapping("/v1/send")
  public String send() throws InterruptedException {
    System.out.println("sending");
    for(int i=0; i<500000; i++) {
      rabbitTemplate.convertAndSend(MessagePublisher.topicExchangeName, "foo.bar.baz", String.format("Sending message: %s", i));
    }
    boolean response = messageReceiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    return response? "Success" : "Error";
  }

}
