package com.shashwat.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner{

	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	public void run(String... args) {
		kafkaTemplate.send("Ewallet.test", 1, "hello Kafka");
	}

}
