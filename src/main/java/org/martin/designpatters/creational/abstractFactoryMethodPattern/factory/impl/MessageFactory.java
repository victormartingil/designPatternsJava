package org.martin.designpatters.creational.abstractFactoryMethodPattern.factory.impl;

import org.martin.designpatters.creational.abstractFactoryMethodPattern.factory.AbstractFactory;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.MessageService;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.NotificationService;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.impl.EnglishMessageService;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.impl.SpanishMessageService;

/**
 * @author victor.martingil
 **/
public class MessageFactory implements AbstractFactory {

    @Override
    public MessageService getMessageType(String language) {
        return switch (language.toLowerCase()) {
            case "spanish" -> new SpanishMessageService();
            case "english" -> new EnglishMessageService();
            default -> null;
        };
    }

    @Override
    public NotificationService getNotificationType(String type) {
        return null;
    }
}
