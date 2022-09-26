package org.martin.designpatters.creational.abstractFactoryMethodPattern.factory;

import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.MessageService;
import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.NotificationService;

/**
 * @author victor.martingil
 **/
public interface AbstractFactory {

    NotificationService getNotificationType(String type);

    MessageService getMessageType(String text);

}
