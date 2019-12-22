package org.shiva.designpatterns.structural.adapter.onetype;

public class NewLineFormatter implements TextFormattable {
    @Override
    public String format(String text) {
        if (text == null) {
            return null;
        }
        return text.replace(".", "\n");
    }
}
