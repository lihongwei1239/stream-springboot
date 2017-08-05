package com.stream.streamspringbootrabbitmq;

import com.stream.streamspringbootrabbitmq.hello.HelloSender;
import com.stream.streamspringbootrabbitmq.many.NeoSender1;
import com.stream.streamspringbootrabbitmq.many.NeoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqManyTest {

    @Autowired
    private NeoSender1 neoSender1;

    @Autowired
    private NeoSender2 neoSender2;

    @Test
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            neoSender1.send(i);
        }
    }

    @Test
    public void manyToMany() throws Exception {
        for (int i=0;i<100;i++){
            neoSender1.send(i);
            neoSender2.send(i);
        }
    }


}
