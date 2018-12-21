package com.example.hello.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.logging.Logger;

@Component
public class Receiver {


    @RabbitListener(queues = "hello-queue")
    public void process (String msg) {
        System.out.println("receiver: " + msg);
    }
}
