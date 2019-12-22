package org.shiva.designpatterns.structural.bridge.message;

import org.shiva.designpatterns.structural.bridge.messagesender.MessageSender;

public class EmailMessage extends Message {
    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }
}
