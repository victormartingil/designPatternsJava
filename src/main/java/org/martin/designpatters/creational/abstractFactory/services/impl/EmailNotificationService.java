package org.martin.designpatters.creational.abstractFactory.services.impl;

import org.martin.designpatters.creational.abstractFactory.services.NotificationService;

/**
 * @author victor.martingil
 **/
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Email notification sent!");
    }
}
