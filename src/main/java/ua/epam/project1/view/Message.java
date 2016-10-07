package ua.epam.project1.view;

public enum Message {

    /**
     * Error all command
     */
    ALL_COMMANDS("All commands :    " +
            "\n dir - show a disk " +
            "\n length - show length of disk " +
            "\n find <enter> minValue(in seconds) <enter> maxValue(in seconds) - show tracks which length between this values"  +
            "\n sort - sort disk by styles"  +
            "\n help - show all commands"  +
            "\n exit - exit from program"),

    /**
     * Error enter min value
     */
    ENTER_MIN_VALUE("enter min value"),

    /**
     * Error enter max value
     */
    ENTER_MAX_VALUE("enter max value"),

    /**
     * Error try again
     */
    TRY_AGAIN("try again"),

    /**
     * Error values no correct
     */
    VALUES_NO_CORRECT("your entered values not correct(min must be < max)"),

    /**
     * Error line no correct
     */
    LINE_NOT_INTEGER("input line is not integer"),

    /**
     * Error fatal error
     */
    ERROR("fatal error"),

    /**
     * Error command not found
     */
    COMMAND_NOT_FOUND("command not found");

    /**
     * Text of error
     */
    private String text;

    /**
     * Constructor
     *
     * @param text text of error
     */
    Message(String text){
        this.text = text;
    }

    /**
     * Get text by error
     * @return text by error
     */
    public String getText(){
        return text;
    }
}
