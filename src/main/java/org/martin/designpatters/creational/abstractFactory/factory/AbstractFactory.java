package org.martin.designpatters.creational.abstractFactory.factory;

import org.martin.designpatters.creational.abstractFactory.services.MessageService;
import org.martin.designpatters.creational.abstractFactory.services.NotificationService;

/**
 * @author victor.martingil
 **/
public interface AbstractFactory {

    NotificationService getNotificationType(String type);

    MessageService getMessageType(String text);

}
