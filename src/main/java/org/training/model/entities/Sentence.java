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
public class Sentence extends CompositeElement {
    private List<Element> elements = new ArrayList<Element>();
    private final String WORD_REGEX = "([\\p{Punct}\\s]+)|([-?!.,:;\\\"]+)";

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void parse(String content) {
        Matcher wordMatcher = Pattern.compile(WORD_REGEX).matcher(content);
        Element element = null;
        while (wordMatcher.find()) {
            if (wordMatcher.group(1) != null) {
                element = new Word();
                element.parse(wordMatcher.group(1));
            } else if (wordMatcher.group(2) != null) {
                element = new Punctuation();
                element.parse(wordMatcher.group(2));
            }
            add(element);
        }
    }


}
