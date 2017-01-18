package org.training;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.training.model.Element;
import org.training.model.entities.Sentence;
import org.training.model.entities.Text;
import org.training.model.entities.Word;


public class ParsingTest {
    private static Element allText;
    private static String testText = TextStrings.TEXT;

    @BeforeClass
    public static void init() {
        allText = new Text();
        allText.parse(testText);
    }

    @Test
    public void testTextProcessing() {
        Text text = (Text) allText;
        Assert.assertEquals(text.getElement(new StringBuilder()).toString(), TextStrings.TEXT);
    }

    @Test
    public void testSentenceProcessing() {
        Text text = (Text) allText;
        Sentence sentence = (Sentence) text.getElements().get(0);
        Assert.assertEquals(sentence.getElement(new StringBuilder()).toString(), TextStrings.SENTENCE);
    }

    @Test
    public void testWordProcessing() {
        Text text = (Text) allText;
        Sentence sentence = (Sentence) text.getElements().get(0);
        Word word = (Word) sentence.getElements().get(2);
        Assert.assertEquals(word.getElement(new StringBuilder()).toString(), TextStrings.WORD_TWO);
    }

}
