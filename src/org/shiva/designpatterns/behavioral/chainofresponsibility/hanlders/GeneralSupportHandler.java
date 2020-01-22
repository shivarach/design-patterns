package org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders;

public class GeneralSupportHandler extends SupportHandler {

    public GeneralSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println("GeneralSupportHandler: Processing request " + message);
    }
}
