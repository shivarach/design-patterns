package org.shiva.designpatterns.structural.bridge.message;

import org.shiva.designpatterns.structural.bridge.messagesender.MessageSender;

public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }
}
