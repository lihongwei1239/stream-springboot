package com.stream.streamspringbootmongodbmulidatasource.domain.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SecondaryRepository extends MongoRepository<SecondaryMongoObject, String> {
}
