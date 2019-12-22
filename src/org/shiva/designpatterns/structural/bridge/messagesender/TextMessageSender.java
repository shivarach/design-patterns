package org.shiva.designpatterns.structural.bridge.messagesender;

public class TextMessageSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending text message: " + message);
    }
}
