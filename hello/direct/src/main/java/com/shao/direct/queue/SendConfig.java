package com.shao.direct.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendConfig {

    @Bean
    public Queue queue() {
        return new Queue("hello-queue");
    }
}
