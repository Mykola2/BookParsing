package org.training.model.entities;


import org.training.model.Element;

/**
 * Created by nicko on 12/19/2016.
 */
public class Letter implements Element {
    private Character letter;
    private int count;

    @Override
    public StringBuilder getElement(StringBuilder element) {
        element.append(letter);
        return element;
    }

    public String getElement() {
        return String.valueOf(letter);
    }

    public void parse(String content) {
        letter = content.charAt(0);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    public int getCount() {
        return count;
    }

}
