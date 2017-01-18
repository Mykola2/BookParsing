package org.training.model.entities;

import org.training.model.CompositeElement;
import org.training.model.ElementFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicko on 12/19/2016.
 */

public class Punctuation extends CompositeElement {

    @Override
    public void parse(String content) {
        for (int i = 0; i < content.length(); i++) {
            ElementFactory elementFactory = new ElementFactory();
            //todo: Change "letter" naming
            Letter letter = (Letter) elementFactory.getElement(Letter.class,
                    String.valueOf(content.charAt(i)));
            add(letter);
        }
        List<Letter> letters = new ArrayList<>();
        int sum = 0;
        for (Letter l : letters) {
            sum += l.getCount();
        }
    }
}
