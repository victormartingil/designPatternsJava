package org.martin.designpatters.creational.factoryMethodPattern.factory;

import org.martin.designpatters.creational.factoryMethodPattern.services.NotificationService;
import org.martin.designpatters.creational.factoryMethodPattern.services.impl.EmailNotificationService;
import org.martin.designpatters.creational.factoryMethodPattern.services.impl.SmsNotificationService;

/**
 * @author victor.martingil
 **/
public class NotificationFactory {

    public NotificationService getNotification(String type) {
        switch (type.toLowerCase()) {
            case "sms":
                return new SmsNotificationService();

            case "email":
                return new EmailNotificationService();
            default:
                return null;
        }
    }

}
