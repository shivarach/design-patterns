package org.shiva.designpatterns.structural.adapter;

import org.shiva.designpatterns.structural.adapter.onetype.TextFormattable;
import org.shiva.designpatterns.structural.adapter.othertype.CSVFormatter;

public class CSVAdapter implements TextFormattable {

    private final CSVFormatter csvFormatter;

    CSVAdapter(CSVFormatter csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String format(String text) {
        return csvFormatter.convertToCSV(text);
    }
}
