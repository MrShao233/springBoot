package com.shao.direct;

import com.shao.direct.queue.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class DirectApplicationTests {

    @Autowired
    private Sender sender;
    @Test
    public void contextLoads() {
        this.sender.send();
    }

}

