package org.martin.designpatters.creational.abstractFactory.services.impl;

import org.martin.designpatters.creational.abstractFactory.services.NotificationService;

/**
 * @author victor.martingil
 **/
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent!");
    }
}
