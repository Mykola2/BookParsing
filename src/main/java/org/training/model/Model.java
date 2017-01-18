package org.training.model;

import org.training.model.entities.Text;
import org.training.model.io.FileUtility;
import org.training.model.task.Task7;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Driver class
 * Created by nicko on 12/26/2016.
 */
public class Model {

    private Element text = new Text();

    public void doTask(String input, String output) {
        FileUtility fileUtility = new FileUtility(input, output);
        text.parse(fileUtility.getText());
        Task7 task = new Task7();
        List<String> sortedWords = task.getSortedByRatioWords(text);
        fileUtility.writeText(sortedWords.stream().collect(Collectors.joining()));

    }
}
