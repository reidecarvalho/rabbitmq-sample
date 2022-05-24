package com.sample.rabbitmq;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeoutException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class RabbitmqSampleApplication {

	public static void main(String[] args) throws IOException, TimeoutException {
		AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) SpringApplication.run(RabbitmqSampleApplication.class, args);

		Producer producer = ctx.getBean(Producer.class);
		producer.send("Enviando info: " + LocalDateTime.now());
	}

}
