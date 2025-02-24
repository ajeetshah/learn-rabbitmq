package com.example.log_aggregator.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

  @GetMapping("/v1/world")
  public String world() {
    log.info("hello world is called");
    return "world";
  }

}
