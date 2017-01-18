package org.training;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.training.model.Element;
import org.training.model.task.Task7;
import org.training.model.entities.Text;

import java.util.List;

public class TaskTest {
    private static Element allText;
    private static String textForSort = TextStrings.TEXT_FOR_SORT;

    @BeforeClass
    public static void init() {
        allText = new Text();
        allText.parse(textForSort);
    }

    @Test
    public void testSort(){
        Task7 task = new Task7();
        List<String> sortedWords = task.getSortedByRatioWords(allText);
        Assert.assertEquals(sortedWords.get(2),"ante = 0.5000\n");
    }
}
