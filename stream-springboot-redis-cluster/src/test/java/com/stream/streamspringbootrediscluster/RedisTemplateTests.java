package com.stream.streamspringbootrediscluster;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTemplateTests {

    private static final Logger logger = LoggerFactory.getLogger(RedisTemplateTests.class);

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Test
    public void redisTest() {
        String key = "redisTestKey";
        String value = "I am test value";

        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();

        //数据插入测试：
        opsForValue.set(key, value);
        String valueFromRedis = opsForValue.get(key);
        logger.info("redis value after set: {}", valueFromRedis);

        //数据删除测试：
        redisTemplate.delete(key);
        valueFromRedis = opsForValue.get(key);
        logger.info("redis value after delete: {}", valueFromRedis);
    }

}
