package org.martin.designpatters.creational.abstractFactoryMethodPattern.services.impl;

import org.martin.designpatters.creational.abstractFactoryMethodPattern.services.MessageService;

/**
 * @author victor.martingil
 **/
public class EnglishMessageService implements MessageService {

    @Override
    public void getMessageContent() {
        System.out.println("This is the message text");
    }
}
