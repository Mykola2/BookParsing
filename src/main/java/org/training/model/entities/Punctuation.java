package org.training.model.entities;

import org.training.model.CompositeElement;
import org.training.model.Element;
import org.training.model.ElementFactory;

/**
 * Created by nicko on 12/19/2016.
 */
public class Punctuation extends CompositeElement {
    public String getElement() {
        return null;
    }
    @Override
    public void parse(String content) {
        for (int i = 0; i < content.length(); i++) {
            ElementFactory elementFactory = new ElementFactory();
            //todo: Change "letter" naming
            Letter letter = (Letter) elementFactory.getElement(Letter.class,
                    String.valueOf(content.charAt(i)));
            add(letter);
        }
    }
}
