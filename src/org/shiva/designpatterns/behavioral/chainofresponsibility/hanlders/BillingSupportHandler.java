package org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders;

public class BillingSupportHandler extends SupportHandler {

    public BillingSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println("BillingSupportHandler: Processing request " + message);
    }
}
