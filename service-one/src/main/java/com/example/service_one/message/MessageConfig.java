package com.example.service_one.message;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

  public static final String EXCHANGE_NAME = "logs_exchange";
  private static final String QUEUE_NAME = "service_one";
  private static final String ROUTING_KEY_PATTERN = "service_one.#";

  @Bean
  Queue queue() {
    return new Queue(QUEUE_NAME, true);
  }

  @Bean
  TopicExchange exchange() {
    return new TopicExchange(EXCHANGE_NAME);
  }

  @Bean
  Binding binding(Queue queue, TopicExchange exchange) {
    return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY_PATTERN);
  }

}
