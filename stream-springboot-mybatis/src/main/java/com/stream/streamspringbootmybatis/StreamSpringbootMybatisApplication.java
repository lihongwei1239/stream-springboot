package com.stream.streamspringbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stream.streamspringbootmybatis.mapper")
public class StreamSpringbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamSpringbootMybatisApplication.class, args);
	}
}
