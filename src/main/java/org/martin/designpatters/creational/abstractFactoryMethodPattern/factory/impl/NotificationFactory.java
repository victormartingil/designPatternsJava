package org.martin.designpatters.creational.abstractFactoryMethodPattern.factory.impl;

import org.martin.designpatters.creational.abstractFactoryMethodPattern.factory.AbstractFactory;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.MessageService;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.NotificationService;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.impl.EmailNotificationService;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.impl.SmsNotificationService;

/**
 * @author victor.martingil
 **/
public class NotificationFactory implements AbstractFactory {

    @Override
    public NotificationService getNotificationType(String type) {
        return switch (type.toLowerCase()) {
            case "sms" -> new SmsNotificationService();
            case "email" -> new EmailNotificationService();
            default -> null;
        };
    }

    @Override
    public MessageService getMessageType(String text) {
        return null;
    }
}
