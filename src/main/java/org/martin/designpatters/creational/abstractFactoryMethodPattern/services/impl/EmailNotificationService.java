package org.martin.designpatters.creational.abstractFactoryMethodPattern.services.impl;

import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.NotificationService;

/**
 * @author victor.martingil
 **/
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Email notification sent!");
    }
}
