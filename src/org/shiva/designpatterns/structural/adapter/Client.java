package org.shiva.designpatterns.structural.adapter;

import org.shiva.designpatterns.structural.adapter.onetype.TextFormattable;
import org.shiva.designpatterns.structural.adapter.othertype.CSVFormatter;

public class Client {
    public static void main(String[] args) {
        final TextFormattable csvAdapter = new CSVAdapter(new CSVFormatter());
        final String csvText = csvAdapter.format("Siva.Rachakonda.Hyderabad");
        System.out.println(csvText);
    }
}
