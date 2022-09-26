package org.martin.designpatters.creational.factoryMethod.services.impl;

import org.martin.designpatters.creational.factoryMethod.services.NotificationService;

/**
 * @author victor.martingil
 **/
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent!");
    }
}
