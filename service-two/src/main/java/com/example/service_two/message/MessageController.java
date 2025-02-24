package com.example.service_two.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@Slf4j
public class MessageController {

  @Autowired
  private MessageSender messageSender;

  @GetMapping("/v1/send")
  public String send(@RequestParam String message) {
    log.info("Sending message: {}", message);
    messageSender.send(message);
    return "Message sent";
  }

}
