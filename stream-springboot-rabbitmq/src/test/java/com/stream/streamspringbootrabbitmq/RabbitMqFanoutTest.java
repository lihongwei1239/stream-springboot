package com.stream.streamspringbootrabbitmq;

import com.stream.streamspringbootrabbitmq.fanout.FanoutSender;
import com.stream.streamspringbootrabbitmq.hello.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqFanoutTest {

    @Autowired
    private FanoutSender sender;

    @Test
    public void fanoutSender() throws Exception {
        sender.send();
    }


}
