package org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders;

public abstract class SupportHandler {
    public static int GENERAL = 10;
    public static int BILLING = 20;
    public static int TECHNICAL = 30;

    protected int level;
    private SupportHandler nextHanlder;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHanlder = nextHandler;
    }

    public void receiveRequest(int level, String message) {
        if(this.level <= level) {
            handleRequest(message);
        } if (nextHanlder != null) {
            nextHanlder.receiveRequest(level, message);
        }
    }

    protected abstract void handleRequest(String message);
}
