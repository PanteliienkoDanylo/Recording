package ua.epam.project1.main;

import ua.epam.project1.controller.Controller;

public class Main {

    /**
     * Create object of Controller and giving control to create objects
     * @param args command line arguments
     */
    public static void main(String[] args){
        Controller controller = new Controller();
        controller.start();


    }
}
