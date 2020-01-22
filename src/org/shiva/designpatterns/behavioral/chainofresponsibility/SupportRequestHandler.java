package org.shiva.designpatterns.behavioral.chainofresponsibility;

import org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders.SupportHandler;
import org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders.BillingSupportHandler;
import org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders.GeneralSupportHandler;
import org.shiva.designpatterns.behavioral.chainofresponsibility.hanlders.TechnicalSupportHandler;

public class SupportRequestHandler {

    public static SupportHandler getHandlerChain() {
        SupportHandler generalSupportHandler = new GeneralSupportHandler(SupportHandler.GENERAL);
        SupportHandler technicalSupportHandler = new TechnicalSupportHandler( SupportHandler.TECHNICAL);
        SupportHandler billingSupportHandler = new BillingSupportHandler(  SupportHandler.BILLING);

        generalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(technicalSupportHandler);

        return generalSupportHandler;
    }

}
