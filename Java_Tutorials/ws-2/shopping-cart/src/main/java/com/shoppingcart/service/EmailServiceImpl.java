package com.shoppingcart.service;

import com.shoppingcart.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private TemplateEngine templateEngine;
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(User user) throws MessagingException {
        Context context = new Context();
        context.setVariable("user", user);
        String process = templateEngine.process("email-template", context);
        javax.mail.internet.MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
        mimeMessageHelper.setSubject("Order Placed!");
        mimeMessageHelper.setText(process, true);
        mimeMessageHelper.setTo(user.getEmail());
        javaMailSender.send(mimeMessage);
    }
}
