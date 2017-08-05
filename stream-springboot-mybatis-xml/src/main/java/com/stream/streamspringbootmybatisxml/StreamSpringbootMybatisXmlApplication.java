package com.stream.streamspringbootmybatisxml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stream.streamspringbootmybatisxml.mapper")
public class StreamSpringbootMybatisXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamSpringbootMybatisXmlApplication.class, args);
	}
}
