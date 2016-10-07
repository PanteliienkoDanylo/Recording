package ua.epam.project1.controller;


public enum Command {

    /**
     * Command "dir"
     */
    DIR("dir"),

    /**
     * Command "length"
     */
    LENGTH("length"),

    /**
     * Command "sort"
     */
    SORT("sort"),

    /**
     * Command "find"
     */
    FIND("find"),

    /**
     * Command "help"
     */
    HELP("help"),

    /**
     * Command "exit"
     */
    EXIT("exit"),

    /**
     * Command "not found"
     */
    NOT_FOUND("command not found");

    /**
     * Text of command
     */
    private String text;

    /**
     * Constructor
     *
     * @param text text of command
     */
    Command(String text){
        this.text = text;
    }

    /**
     * Get command by text
     * @param text text of command
     * @return
     */
    public static Command getCommand(String text) {
        for(Command command : Command.values()){
            if(command.text.equals(text)){
                return command;
            }
        }
        return NOT_FOUND;
    }
}

