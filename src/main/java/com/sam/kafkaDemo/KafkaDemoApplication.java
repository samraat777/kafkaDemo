package com.sam.kafkaDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);
	}


	//For Checking with rest
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate)
	{
		return args -> {
			kafkaTemplate.send("NewTopic","Hello there we got kafka up and running +1");
		};
	}
}
