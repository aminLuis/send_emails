package com.envioemails.envioemails.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Envio_email {

    @Autowired
    private JavaMailSender send_email;

    public void enviar_email(String to, String subject, String content) {

        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo(to);
        email.setSubject(subject);
        email.setText(content);

        send_email.send(email);
    }

    public void send_email(String email_destino) {

    }

}
