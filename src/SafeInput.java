import java.util.Scanner;
public class SafeInput
{
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
}
    /**
     * @param pipe The scanner instance to use for the console input
     * @param prompt A String that tells the user what to input
     * @param low
     * @param high
     * @return
      */


