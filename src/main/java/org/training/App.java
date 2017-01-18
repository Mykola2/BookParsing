package org.training;

import org.training.model.Model;


public class App 
{
    public static void main( String[] args )
    {
        Controller controller = new Controller(new Model(), new View());
        controller.process();
    }
}
