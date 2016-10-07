package ua.epam.project1.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class View {

    /**
     * Number for input min and max values
     */
    private int number = 0;

    /**
     * BufferedReader
     */
    private BufferedReader bufferedReader;

    /**
     * InputStreamReader
     */
    private InputStreamReader inputStreamReader;

    /**
     * Constructor
     *
     * Default constructor
     */
    public View(){
        this.inputStreamReader = new InputStreamReader(System.in);
        this.bufferedReader = new BufferedReader(inputStreamReader);
    }

    /**
     * Get line, which input user
     * @return line, which input user
     */
    public String getInputLine(){
        String input = "";
        while(true) {
            try {
                input = bufferedReader.readLine();
            } catch (Exception e) {
                printError(Message.ERROR);
            }
            return input;
        }
    }

    /**
     * Get min value, which input user
     * @return min value, which input user
     */
    public int getInputMinNumber(){
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            printError(Message.LINE_NOT_INTEGER);
            printError(Message.ENTER_MIN_VALUE);
            getInputMinNumber();
        }
        return number;
    }

    /**
     * Get max value, which input user
     * @return max value, which input user
     */
    public int getInputMaxNumber(){
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            printError(Message.LINE_NOT_INTEGER);
            printError(Message.ENTER_MAX_VALUE);
            getInputMaxNumber();
        }
        return number;
    }

    /**
     * Parse object array in string
     * @param a object array
     * @return array in string
     */
    public String toString(Object[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.toString();
        }
    }

    /**
     * Print anything string parameter
     * @param line anything string parameter
     */
    public void print(String line){
        System.out.println(line);
    }

    /**
     * Print anything error parameter
     * @param message anything error parameter
     */
    public void printError(Message message){
        System.out.println(message.getText());
    }
    /**
     * Exit from program
     */
    public void exit(){
        System.exit(0);
    }

    /**
     * Print anything array of object
     * @param disk array of object
     */
    public void printArray(Object[] disk){
        System.out.println(toString(disk));
    }






}
