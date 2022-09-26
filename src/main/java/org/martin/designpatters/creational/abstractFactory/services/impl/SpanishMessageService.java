package org.martin.designpatters.creational.abstractFactory.services.impl;

import org.martin.designpatters.creational.abstractFactory.services.MessageService;

/**
 * @author victor.martingil
 **/
public class SpanishMessageService implements MessageService {

    @Override
    public void getMessageContent() {
        System.out.println("Este es el texto del mensaje");
    }
}
