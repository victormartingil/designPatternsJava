package org.martin.designpatters.creational.factoryMethodPattern;

import org.martin.designpatters.creational.factoryMethodPattern.factory.NotificationFactory;
import org.martin.designpatters.creational.factoryMethodPattern.services.NotificationService;

/**
 * @author victor.martingil
 **/
public class FactoryMethodMain {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        NotificationService smsNotification = notificationFactory.getNotification("sms");
        smsNotification.sendNotification();

        NotificationService emailNotification = notificationFactory.getNotification("email");
        emailNotification.sendNotification();

    }

}
