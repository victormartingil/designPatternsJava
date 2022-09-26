package org.martin.designpatters.creational.abstractFactoryMethodPattern;

import org.martin.designpatters.creational.abstractFactoryMethodPattern.factory.AbstractFactory;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.factory.FactoryProducer;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.MessageService;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.NotificationService;

/**
 * @author victor.martingil
 **/
public class AbstractFactoryPatternMain {

    public static void main (String[] args){
        AbstractFactory notificationFactory = FactoryProducer.getFactory("notification");
        NotificationService notificationService = notificationFactory.getNotificationType("email");
        notificationService.sendNotification();

        AbstractFactory messageFactory = FactoryProducer.getFactory("message");
        MessageService messageService = messageFactory.getMessageType("english");
        messageService.getMessageContent();
    }

}
