package org.training.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicko on 12/19/2016.
 */
public class CompositeElement implements Element {
    private List<Element> elements = new ArrayList<Element>();

    public String getElement() {
        return null;
    }

    public void parse(String content) {

    }

    public void add(Element element){
        elements.add(element);
    }

    public void remove(Element element){
        elements.remove(element);
    }
}
