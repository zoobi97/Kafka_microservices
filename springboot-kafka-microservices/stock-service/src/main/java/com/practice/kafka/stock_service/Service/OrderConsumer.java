package com.practice.kafka.stock_service.Service;

import com.practice.kafka.base_domains.DTO.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void Consume(OrderEvent event){
        LOGGER.info(String.format("Order received in stock service => %s",event.toString()));


    }
}
