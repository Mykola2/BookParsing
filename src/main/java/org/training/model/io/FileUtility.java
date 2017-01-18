package org.training.model.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * File operations
 * Created by nicko on 12/19/2016.
 */

public class FileUtility {
    private String input;
    private String output;

    public FileUtility(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public String getText() {
        String result = "";
        try {
            result = IOUtils.toString(new FileReader(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void writeText(String text){
        File outputFile = new File(output);
        try {
            FileUtils.writeStringToFile(outputFile,text,"UTF-8",false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
