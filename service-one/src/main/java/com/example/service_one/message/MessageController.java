package com.example.service_one.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

  @Autowired
  private MessageSender messageSender;

  @GetMapping("/v1/send")
  public String send(@RequestParam String message) {
    messageSender.send(message);
    return "Message sent";
  }

}
