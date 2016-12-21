package org.training.model;

import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/**
 * Created by nicko on 12/19/2016.
 */
public class ElementFactory {
    private WeakHashMap<String, Element> elements = new WeakHashMap<String, Element>();

    public Element getElement(Class<? extends Element> c, String term) {
        Element element = elements.get(term);
        if (element == null) {
            try {
                element = c.getDeclaredConstructor().newInstance();
                elements.put(term, element);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return element;
    }
}
