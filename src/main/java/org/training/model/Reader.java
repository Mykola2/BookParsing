package org.training.model;

import org.apache.commons.io.IOUtils;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nicko on 12/19/2016.
 */
public class Reader {
    private String input;
    private String output;

    public String getText() {
        String result = "";
        try {
            result = IOUtils.toString(new FileReader(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
