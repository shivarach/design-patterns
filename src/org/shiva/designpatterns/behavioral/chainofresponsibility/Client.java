package org.shiva.designpatterns.behavioral.chainofresponsibility;

import org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders.SupportHandler;

public class Client {
    /*
    Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle
    the request. Chain the receiving objects and pass the request along the chain until an object handles it
     */
    public static void main(String[] args) {
        final SupportHandler handlerChain = SupportRequestHandler.getHandlerChain();

        handlerChain.receiveRequest(30, "What is the status of connection?");
    }
}
