package com.jxau.wmy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CmovieMasterApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setSubject("王哥真帅");
        mailMessage.setText("你王哥是最帅的！！！");

        mailMessage.setTo("1551573261@qq.com");
        mailMessage.setFrom("1627844806@qq.com");

        mailSender.send(mailMessage);
    }

}
