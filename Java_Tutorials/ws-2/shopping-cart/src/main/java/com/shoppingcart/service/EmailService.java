package com.shoppingcart.service;

import com.shoppingcart.entity.User;

import javax.mail.MessagingException;

public interface EmailService {

    public void sendEmail(User user) throws MessagingException;
}
