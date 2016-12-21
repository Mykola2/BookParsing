package org.training.model.entities;


import org.training.model.Element;

/**
 * Created by nicko on 12/19/2016.
 */
public class Letter implements Element {
    private Character letter;

    public String getElement() {
        return String.valueOf(letter);
    }

    public void parse(String content) {
        letter = content.charAt(0);
    }


}
