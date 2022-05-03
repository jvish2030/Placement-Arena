/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.service;

import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author jatin
 */
public class Emailer {

    static Properties properties = new Properties();

    static {
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
    }

    public static String sendEmailTo(String userName, String userMail, String userPwd, int id) {
        String status = "success";
        String body;
        body = String.format("Your Login Credentials \n \n email : %s \n password : %s \n Unique Id : %s \n \nThank you.", userMail, userPwd, id);
        try {
            javax.mail.Session session = javax.mail.Session.getDefaultInstance(properties,
                    new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication
                        getPasswordAuthentication() {
                    return new PasswordAuthentication("tpoplacementarena@gmail.com", "tpo@1234");
                }
            }
            );

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tpoplacementarena@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(userMail));
            message.setSubject("Welcome to Placement Arena , " + userName + "!");
            message.setText(body);
            Transport.send(message);
        } catch (MessagingException e) {
            status = "error";
        }
        return status;
    }

    boolean sendAppointmentEmail(String uname, String email, String date_time) {
        boolean status = true;
        String body;
        body = String.format("Hii %s \n \nYour appointment is scheduled on %s \nThank you.", uname, date_time);
        try {
            javax.mail.Session session = javax.mail.Session.getDefaultInstance(properties,
                    new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication
                        getPasswordAuthentication() {
                    return new PasswordAuthentication("tpoplacementarena@gmail.com", "tpo@1234");
                }
            }
            );

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tpoplacementarena@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email));
            message.setSubject("Appointment with TPO!");
            message.setText(body);
            Transport.send(message);
        } catch (MessagingException e) {
            status = false;
        }
        return status;
    }

}
