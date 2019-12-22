package org.shiva.designpatterns.structural.bridge.message;

import org.shiva.designpatterns.structural.bridge.messagesender.MessageSender;

public abstract class Message {

    private MessageSender messageSender;

    Message(MessageSender messageSender) {

        this.messageSender = messageSender;
    }

    public void send(String message) {
        messageSender.sendMessage(message);
    }
}
