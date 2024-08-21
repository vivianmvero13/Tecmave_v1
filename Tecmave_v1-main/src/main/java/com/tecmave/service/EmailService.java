/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmave.service;


/**
 *
 * @author Cris
 */
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    public void sendHtmlEmail(String correoUsuario, String asunto, String cuerpo) throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();

        message.setFrom(new InternetAddress(correoUsuario));
        message.setRecipients(MimeMessage.RecipientType.TO, "tecmave@gmail.com");
        message.setSubject(asunto);

        String htmlContent = cuerpo;
        message.setContent(htmlContent, "text/html; charset=utf-8");

        emailSender.send(message);
    }
}
