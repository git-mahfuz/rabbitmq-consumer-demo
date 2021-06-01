package com.infy.consumerdemorabbitmq.consumer;

import com.infy.consumerdemorabbitmq.dto.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void newOrderPlacedListener(Order order) {
        System.out.println("Fetched: " + order.getOrderId() + " / " + order.getCustomerName());
    }
}
