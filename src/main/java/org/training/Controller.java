package org.training;

import org.training.model.Model;

/**
 * Created by nicko on 12/26/2016.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process(){
        model.doTask("input.txt","output.txt");
    }
}
