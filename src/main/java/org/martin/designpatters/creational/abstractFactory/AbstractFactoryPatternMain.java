package org.martin.designpatters.creational.abstractFactory;

import org.martin.designpatters.creational.abstractFactory.factory.AbstractFactory;
import org.martin.designpatters.creational.abstractFactory.factory.FactoryProducer;
import org.martin.designpatters.creational.abstractFactory.services.MessageService;
import org.martin.designpatters.creational.abstractFactory.services.NotificationService;

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
