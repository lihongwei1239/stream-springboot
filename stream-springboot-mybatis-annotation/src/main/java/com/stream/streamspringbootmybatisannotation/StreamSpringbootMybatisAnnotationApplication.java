package com.stream.streamspringbootmybatisannotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stream.streamspringbootmybatisannotation.mapper")
public class StreamSpringbootMybatisAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamSpringbootMybatisAnnotationApplication.class, args);
	}
}
