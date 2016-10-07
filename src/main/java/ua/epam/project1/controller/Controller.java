package ua.epam.project1.controller;

import ua.epam.project1.model.Disk;
import ua.epam.project1.view.Message;
import ua.epam.project1.view.View;


public class Controller {

    /**
     * Disk
     */
    private Disk disk;
    /**
     * View
     */
    private View view;

    public Controller() {
        view = new View();
        disk = new Disk();
    }

    /**
     * Print all commands and get input line
     */
    public void start(){
        view.printError(Message.ALL_COMMANDS);
        checkCommand();
    }

    /**
     * Get line which input user, and compare with commands
     */
    public void checkCommand(){
        do{
            String s = view.getInputLine();
            switch (Command.getCommand(s)){
                case NOT_FOUND:
                    view.printError(Message.COMMAND_NOT_FOUND);
                    break;
                case DIR:
                    view.printArray(disk.DISK.getDisk());
                    break;
                case LENGTH:
                    int timeLength = disk.getDiskLength();
                    int hour = disk.getDiskLength() / 3600;
                    int minute = disk.getDiskLength() / 60;
                    int second = timeLength - minute * 60;
                    view.print(hour + ":" + minute + ":" + second + "(" + disk.getDiskLength() + ")");
                    break;
                case SORT:
                    view.printArray(disk.sortDiskByStyle().getDisk());
                    break;
                case FIND:
                    view.printError(Message.ENTER_MIN_VALUE);
                    int minValue = view.getInputMinNumber();
                    view.printError(Message.ENTER_MAX_VALUE);
                    int maxValue = view.getInputMaxNumber();
                    if(minValue > maxValue){
                        view.printError(Message.VALUES_NO_CORRECT);
                        view.printError(Message.TRY_AGAIN);
                    }else {
                        view.printArray(disk.findTracksByLength(minValue, maxValue).getDisk());
                    }
                    break;
                case HELP:
                    view.printError(Message.ALL_COMMANDS);
                    break;
                case EXIT:
                    view.exit();
                    break;
            }
        }while (true);
    }
}
