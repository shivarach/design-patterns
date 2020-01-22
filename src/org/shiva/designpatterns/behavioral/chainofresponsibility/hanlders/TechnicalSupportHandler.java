package org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders;

public class TechnicalSupportHandler extends SupportHandler {

    public TechnicalSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println("TechnicalSupportHandler: Processing request " + message);
    }
}
