package org.training.model.entities;

import org.training.model.CompositeElement;
import org.training.model.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nicko on 12/19/2016.
 */
public class Text extends CompositeElement {
    private List<Element> elements = new ArrayList<Element>();
    private final String SENTENCE_REGEX = "^\\s+[A-Za-z,;'\"\\s]+[.?!]$";

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void parse(String content) {
        Matcher sentenceMatcher = Pattern.compile(SENTENCE_REGEX).matcher(content);
        while (sentenceMatcher.find()){
            Element element = new Sentence();
            element.parse(sentenceMatcher.group());
            add(element);
        }
    }

}
