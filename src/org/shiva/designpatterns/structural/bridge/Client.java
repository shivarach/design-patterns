package org.shiva.designpatterns.structural.bridge;

import org.shiva.designpatterns.structural.bridge.message.EmailMessage;
import org.shiva.designpatterns.structural.bridge.message.Message;
import org.shiva.designpatterns.structural.bridge.message.TextMessage;
import org.shiva.designpatterns.structural.bridge.messagesender.EmailMessageSender;
import org.shiva.designpatterns.structural.bridge.messagesender.TextMessageSender;

public class Client {
    /*
    Decouple an abstraction from its implementation so that the two can vary independently.

    Bridge and Adapter may look similar.

    Adapter pattern is useful when you have existing code, be it third party, or in-house, but out of your control,
    or otherwise not changeable to quite meet the interface you need it to.

    The Bridge pattern is something you implement up front - if you know you have two orthogonal hierarchies,
    it provides a way to decouple the interface and the implementation in such a way that you don't get an insane
    number of classes
     */
    public static void main(String[] args) {
        Message message = new TextMessage(new TextMessageSender());
        message.send("Hello from messenger");

        final Message emailMessage = new EmailMessage(new EmailMessageSender());
        emailMessage.send("Hello from Gmail");
    }
}
