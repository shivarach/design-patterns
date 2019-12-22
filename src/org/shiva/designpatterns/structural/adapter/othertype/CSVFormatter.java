package org.shiva.designpatterns.structural.adapter.othertype;

public class CSVFormatter implements CSVFormattable {
    @Override
    public String convertToCSV(String text) {
        if (text == null) {
            return null;
        }
        return text.replace(".", ",");
    }
}
