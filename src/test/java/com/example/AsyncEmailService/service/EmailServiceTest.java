package com.example.AsyncEmailService.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import static org.mockito.Mockito.*;
public class EmailServiceTest {

    @Mock
    private JavaMailSender mailSender;

    @InjectMocks
    private EmailService emailService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSendEmail() {
        String to = "recipient@example.com";
        String subject = "Test";
        String text = "This is a test email";

        emailService.sendEmail(to, subject, text);

        // Проверяем, что метод send был вызван один раз с правильными параметрами
        verify(mailSender, times(1)).send(any(SimpleMailMessage.class));
    }
}
