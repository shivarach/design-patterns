package org.shiva.designpatterns.creational.prototype;

public class TermsAndConditions extends PrototypeCapableDocument {
    @Override
    public PrototypeCapableDocument cloneDocument() {
        /*Clone with shallow copy*/
        TermsAndConditions termsAndConditions = null;
        try {
            termsAndConditions = (TermsAndConditions) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return termsAndConditions;
    }
}
