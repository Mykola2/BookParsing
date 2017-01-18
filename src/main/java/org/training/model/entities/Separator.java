package org.training.model.entities;


import org.training.model.CompositeElement;
import org.training.model.Element;
import org.training.model.ElementFactory;

import java.util.ArrayList;
import java.util.List;

public class Separator extends CompositeElement {
    List<Element> list = new ArrayList<>();

    @Override
    public List<Element> getElements() {
        return list;
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
