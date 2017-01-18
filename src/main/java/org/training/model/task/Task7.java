package org.training.model.task;

import org.training.model.CompositeElement;
import org.training.model.Element;
import org.training.model.entities.Word;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Methods for Task 7 (calculating vowels ratio of each word in text
 * Created by nicko on 12/22/2016.
 */
public class Task7 {
    private List<Element> words = new ArrayList<>();
    private Map<String, Double> ratio = new HashMap<>();

    public List<String> getSortedByRatioWords(Element text) {
        List<String> sortedWords = new ArrayList<>();
        NumberFormat formatter = new DecimalFormat("#0.0000");
        //getting words from text
        getWords(text);
        //converting each Word object to String
        List<String> wordsInStrings = words
                .stream()
                .map(Element::getElement)
                .collect(Collectors.toList());
        //putting words and ratio into map
        wordsInStrings.forEach(w -> ratio.put(w.toLowerCase(), calculateVowels(w) / w.length()));
        //sorting ratio map by value and putting keys and values to List<String> in format "Key = Value"
        ratio.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(e -> sortedWords.add(e.getKey() + " = " + formatter.format(e.getValue()) + "\n"));
        return sortedWords;
    }

    public Map<String, Double> getRatio() {
        return ratio;
    }

    private void getWords(Element text) {
        for (Element e : ((CompositeElement) text).getElements()) {
            if (e.getClass() == Word.class) words.add(e);
            if (e.isComposite()) getWords(e);
        }
    }

    private Double calculateVowels(String word) {
        double vowelNumber = 0;
        for (Character c : word.toCharArray()) {
            Character lowerCaseChar = Character.toLowerCase(c);
            if (lowerCaseChar.equals('o') || lowerCaseChar.equals('a') || lowerCaseChar.equals('e') || lowerCaseChar.equals('i')
                    || lowerCaseChar.equals('u')) {
                vowelNumber++;
            }
        }
        if (vowelNumber == 0)
            return -1.0;
        return vowelNumber;
    }
}
