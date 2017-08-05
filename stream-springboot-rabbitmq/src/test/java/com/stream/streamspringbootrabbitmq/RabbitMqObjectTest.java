package com.stream.streamspringbootrabbitmq;

import com.stream.streamspringbootrabbitmq.domain.User;
import com.stream.streamspringbootrabbitmq.hello.HelloSender;
import com.stream.streamspringbootrabbitmq.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqObjectTest {

    @Autowired
    private ObjectSender objectSender;

    @Test
    public void sendOject() throws Exception {
        User user=new User();
        user.setName("neo");
        user.setPass("123456");
        objectSender.send(user);
    }
}
