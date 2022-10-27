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
        int favNum = SafeInput.getRangedInt(scan, "Enter your favorite number", 1, 100);
        // System.out.println("You said your fac num is " + getRangedInt(scan, "Enter your favorite number", 1, 100));

    }


    //user define static methods go here - after main
    public static void sayHello()
    {
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
}