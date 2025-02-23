# Learn RabbitMQ

## How to start rabbitmq?

You can build and start the rabbitmq docker image using [compose.yaml](./compose.yaml) file:

```shell
docker compose up rabbitmq
# or
docker compose start rabbitmq
```

## RabbitMQ

- Managment Page: http://localhost:15672: check docker compose file for username and password

## Learning

- What is volumes compose file?
- What is difference b/w up and start?
- Build vs Up / Start docker?
- Docker image vs container?
- What is @Bean?
- What is routing key?
- What is @Service in SB?

# Todo
- Setup logs in all 3 services
- Send logs of all the 3 services to RabbitMQ

