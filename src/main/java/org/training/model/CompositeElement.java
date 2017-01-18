package org.training.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents a composite Component
 * Created by nicko on 12/19/2016.
 */
public class CompositeElement implements Element {
    private List<Element> elements = new ArrayList<>();

    public StringBuilder getElement(StringBuilder element) {
        getElements().forEach(e -> e.getElement(element));
        return element;
    }

    public String getElement() {
        return getElement(new StringBuilder()).toString();
    }

    public void parse(String content) {

    }

    public List<Element> getElements() {
        return elements;
    }

    public boolean isComposite() {
        return true;
    }

    public void add(Element element) {
        getElements().add(element);
    }

}
