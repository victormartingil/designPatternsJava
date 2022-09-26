package org.martin.designpatters.creational.abstractFactory.factory.impl;

import org.martin.designpatters.creational.abstractFactory.factory.AbstractFactory;
import org.martin.designpatters.creational.abstractFactory.services.MessageService;
import org.martin.designpatters.creational.abstractFactory.services.NotificationService;
import org.martin.designpatters.creational.abstractFactory.services.impl.EnglishMessageService;
import org.martin.designpatters.creational.abstractFactory.services.impl.SpanishMessageService;

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
