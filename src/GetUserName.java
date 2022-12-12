import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String fName = "";
        String lName = "";

        //prompts and inputs first and last name
        fName = SafeInput.getNonZeroLengthString(scan, "Please enter your first name");
        lName = SafeInput.getNonZeroLengthString(scan, "Please enter your last name");

        //output
        System.out.println("\nYour full name is: " + fName + " " + lName);
    }
}