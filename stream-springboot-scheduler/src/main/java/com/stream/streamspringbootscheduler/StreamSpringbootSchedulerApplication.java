package com.stream.streamspringbootscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StreamSpringbootSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamSpringbootSchedulerApplication.class, args);
	}
}
