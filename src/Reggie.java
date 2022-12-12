import java.util.Scanner;

public class Reggie {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);


        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        //Prompts SSN
        String c = "please enter SSN (#) ";
        String SSN = SafeInput.getRegExString(in, c, ssnPattern);
        System.out.println("Your SSN (#): " + SSN);
        //prompts M number
        c = " Last one! Please enter M#: ";
        String Dframe = "(M|m)\\d{8}";
        String Mn = SafeInput.getRegExString(in, c, Dframe);
        //Prints UC

        System.out.println("Thank you!  \nYour M#  is: " + Mn);
    }
}