package org.training.model;

/**
 * Created by nicko on 12/19/2016.
 */
public interface Element {
    StringBuilder getElement(StringBuilder element);
    String getElement();
    void parse(String content);
    boolean isComposite();
}
