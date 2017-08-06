package com.stream.streamspringbootmongodbmulidatasource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "com.stream.streamspringbootmongodbmulidatasource.domain.repository.primary",
        mongoTemplateRef = PrimaryMongoConfig.MONGO_TEMPLATE
        )
public class PrimaryMongoConfig {

    protected static final String MONGO_TEMPLATE = "primaryMongoTemplate";

}
