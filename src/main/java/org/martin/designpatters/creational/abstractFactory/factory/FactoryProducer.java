package org.martin.designpatters.creational.abstractFactory.factory;

import org.martin.designpatters.creational.abstractFactory.factory.impl.MessageFactory;
import org.martin.designpatters.creational.abstractFactory.factory.impl.NotificationFactory;

/**
 * @author victor.martingil
 **/
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("notification")) {
            return new NotificationFactory();
        } else if (factoryType.equalsIgnoreCase("message")) {
            return new MessageFactory();
        }

        return null;
    }
}
