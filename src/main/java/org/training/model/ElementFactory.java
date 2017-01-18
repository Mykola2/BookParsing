package org.training.model;

import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/**
 * Reduce the cost of creating and manipulating a large number of Element objects.
 * Created by nicko on 12/19/2016.
 */
public class ElementFactory {
    private static WeakHashMap<String, Element> elements = new WeakHashMap<>();

    public Element getElement(Class<? extends Element> c, String term) {
        Element element = null;
            try {
                if (elements.containsKey(term)){
                    element = elements.get(term);
                }else {
                    element = c.getDeclaredConstructor().newInstance();
                    element.parse(term);
                    elements.put(term, element);

                }
            } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }

        return element;
    }
}
