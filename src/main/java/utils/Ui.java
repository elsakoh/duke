package utils;
/**
 * Ui class handles everything to do with printing to console and formatting strings.
 */

public class Ui {

    public Ui() {
        logo();
        greeting();
    }

    void logo() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
    }

    /**
     * inital message from duke.
     */

    static void greeting() {
        String output = "    ____________________________________________________________\n" 
            + "     Hello! I'm Duke\n"
            + "     What can I do for you?\n"
            + "    ____________________________________________________________\n";
        System.out.println(output);
    }
    
    static String addDoubleLine(String str) {
        String line = "    ____________________________________________________________";
        return line + "\n" + str + "\n" + line;
    }

    public String printMsg(Task t, int size) {
        return ("     Got it. I've added this task: \n" 
            + "      " + t.toString() + "\n     Now you have " + size + " tasks in the list.");
    }
    public String doneString(Task t){
        return ("     Got it. I've marked this task as done: \n" 
        + "      " + t.toString());
    }
    public String print(String str) {
        return str;
    }

    public String printTab(String str) {
        return "    " + str ;
    }
    
    public String bye() {
        return(addDoubleLine("     Bye. Hope to see you again soon!"));
    }
}