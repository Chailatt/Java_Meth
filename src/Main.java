import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /*

        sayHello();

        sayHello(13);

        sayMsg("Dang Tom", 35);

        int favNum = 7;
        int doubleIt = doubleIt(doubleIt(favNum));
        System.out.println("Doubled is: " + doubleIt);

         */
        int favNum = SafeInput.getRangedInt(scan, "Please enter your favorite number! ", 1, 100);
        // System.out.println("You said your fac num is " + getRangedInt(scan, "Enter your favorite number", 1, 100));

    }


    //user define static methods go here - after main
    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void sayHello(int times) {
        for (int i = 0; i <= times; i++)
            System.out.println("Hello!");
    }

    public static void sayMsg(String msg, int times) {
        for (int i = 0; i <= times; i++)
            System.out.println(msg);
    }

    public static int doubleIt(int num) {
        int retVal = 0;
        retVal = num * 2;
        return retVal;
        /**
         * Returns a user supplied int of arbitrary value
         *
         * @param pipe The scanner instance to use for the console input
         * @param prompt A String that tells the user what to input
         * @return ann arbitrary integer of any value
         */
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {

            System.out.print(prompt + "[" + low + " " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the next line for the buffer
                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said your favorite num is " + retVal + " ");
                    done = true;
                } else // not an int
                {
                    System.out.println("You said your ret val num is " + retVal + " but that is out of range[" + low + " - " + high + "];");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("you must not enter an integer not " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * @param pipe
     * @param prompt
     * @return
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            // favorite number 1-10
            System.out.println(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the next line from the buffer
                done = true;
            } else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("you must enter  an integer not " + trash);
            }
        } while (!done);
        return retVal;
    }

    /**
     * returns a user supplied int of arbitrary value
     *
     * @param pipe the scanner to use  for the input
     * @param prompt the string prompt telling the user what to input
     * @return an arbitrary double of any value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do{
            // favorite number 1-10
            System.out.println(prompt +": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the next line from the buffer
                done = true;
            }else // don't have a double
            {
                trash=pipe.nextLine();
                System.out.println("you must enter  an Double not "+trash);
            }

        }while(!done);
        return retVal;
    }/**
     * get a double value with a specified inclusive range
     *
     * @param pipe Scanner to read the console
     * @param prompt The prompt to tell the user what an input
     * @param low the low value for the range
     * @param high the high value for the range
     * @return a Double within range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.println(prompt +"["+low+ "-"+high+"]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the newline form buffer
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nYou said your ret val is " + retVal + "But that is out of the range["+ low + " " + high + "]");
                }
            }
            else  //
            {
                trash = pipe.nextLine();
                System.out.println("Yo u must enter an Double not " + trash);
            }
            return retVal;
        }while (!done);
    }
    /**
     * gets a string with at least 1 character
     *
     * @param pipe scanner to use for input
     * @param prompt string prompt to tell the user what to input
     * @return a non zero length string
     */
    public static String getnonZeroLengthString(Scanner pipe,String prompt)
    {
        String retVal = "";
        String trash = "";
        boolean done = false;
        do{
            // favorite number 1-10
            System.out.println(prompt +"[Y/N] : ");
            retVal = pipe.nextLine();

            if(retVal.length() != 0)
            {
                done = true;
            }else // don't have a 0 length String
            {
                System.out.println("you must enter at least 1 character.");
            }

        }while(!done);
        return retVal;
    }
    /**
     * gets a string that matches a regular expression pattern like ###-##-#### \d{3}-\d{2}-\d{4}
     *
     * @param pipe scanner to use for input
     * @param prompt string prompt to tell the user what to input
     * @return a string that matches the RegEx pattern
     */
    public static String getRegExString(Scanner pipe,String prompt,String pattern)
    {
        String retVal = "";
        boolean done = false;
        do{
            // favorite number 1-10
            System.out.println(prompt +": ");
            retVal = pipe.nextLine();

            if(retVal.matches(pattern))
            {
                done = true;
            }else // you have a zero length string
            {
                System.out.println("What you entered does not match the pattern. ."+ pattern);
            }

        }while(!done);
        return retVal;
    }
    /**
     * takes a Y or an N and returns true or false respectively
     *
     * @param pipe Scanner to use for console input
     * @param prompt String that indicated what to input
     * @return A boolean true or false based on the y or n input
     */
     public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = false;
        boolean trash =false;
        boolean done = false;
        String inputYN = "";

        do
        {
            // favorite number 1-10
            System.out.println(prompt +"[Y/N]: ");
            inputYN = pipe.nextLine();
            if(inputYN.equalsIgnoreCase("Y"))
            {
                done = true;
                retVal = true;
            } else if (inputYN.equalsIgnoreCase("N"))
            {
                done = true;
                retVal = false;
            } else
            {
                System.out.println("you must enter Y or N");
            }

        }while(!done);
        return retVal;

    }
    /**
     * gets a string that matches a reg
     *
     * @param
     */

    public static String getRegExString1(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            // favorite number 1-10
            System.out.println(prompt +": ");
            retVal = pipe.nextLine();
            if(retVal.matches(regEx))
            {
                done = true;
            }
            else {
                System.out.println("you must enter a string that matches the pattern");
            }

        }while(!done);
        return retVal;
    }

}
