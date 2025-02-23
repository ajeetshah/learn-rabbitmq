package com.example.service_one.message;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

  private final CountDownLatch latch = new CountDownLatch(1);

  public void receiveMessage(String message) {
    System.out.printf("Received: %s%n", message);
    latch.countDown();
  }

  public CountDownLatch getLatch() {
    return latch;
  }

}