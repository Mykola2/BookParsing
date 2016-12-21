package org.training.model.entities;

import org.training.model.CompositeElement;
import org.training.model.Element;
import org.training.model.ElementFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicko on 12/19/2016.
 */
public class Word extends CompositeElement {
    private List<Element> elements = new ArrayList<Element>();

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void parse(String content) {
        for (int i = 0; i < content.length(); i++) {
            ElementFactory elementFactory = new ElementFactory();
            Letter letter = (Letter) elementFactory.getElement(Letter.class,
                    String.valueOf(content.charAt(i)));
            add(letter);
        }
    }
}
