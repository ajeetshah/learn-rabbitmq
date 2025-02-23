package com.example.service_one.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

  private static final int TIMEOUT = 10000;

  @Autowired
  private MessageSender messageSender;
  @Autowired
  private MessageReceiver messageReceiver;

  @GetMapping("/v1/send")
  public String send(@RequestParam String message) throws InterruptedException {
    System.out.println("sending");
    for (int i = 0; i < 500000; i++) {
      messageSender.send(String.format("%s %sth", message, i));
    }
    return "Message sent";
  }

}
