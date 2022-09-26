package org.martin.designpatters.creational.factoryMethod;

import org.martin.designpatters.creational.factoryMethod.factory.NotificationFactory;
import org.martin.designpatters.creational.factoryMethod.services.NotificationService;

/**
 * @author victor.martingil
 **/
public class FactoryPatternMain {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        NotificationService smsNotification = notificationFactory.getNotification("sms");
        smsNotification.sendNotification();

        NotificationService emailNotification = notificationFactory.getNotification("email");
        emailNotification.sendNotification();

    }

}
