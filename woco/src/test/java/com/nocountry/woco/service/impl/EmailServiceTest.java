package com.nocountry.woco.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailServiceTest {
@Autowired
private EmailService emailService;
    @Test
    void send() {
        emailService.send("");
    }
}