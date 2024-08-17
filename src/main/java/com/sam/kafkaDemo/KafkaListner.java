package com.sam.kafkaDemo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {
    @KafkaListener(topics = "NewTopic",groupId = "newGroup")
    void listener(String data){
        System.out.println("Listener Recieved Data: "+ data);
    }
}
