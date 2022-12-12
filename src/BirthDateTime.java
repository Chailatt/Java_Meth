import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int birthY = SafeInput.getRangedInt(scan, " Please type Your birthday year ",1950,2010);

        int birthM = SafeInput.getRangedInt(scan, "Please type birthday month ",1,12);

        int birthD = SafeInput.getRangedInt(scan, "Please type Your birthday day ",1,31);

        int birthMS = SafeInput.getRangedInt(scan, "Please type Your birthday hour ",0,24);

        int birthH = SafeInput.getRangedInt(scan, "Please type your birthday minute",0,60);

        System.out.println("\nYour birthday is on the year: " + birthY + "\n on the month number: " +
                birthM + "\n on the day number: " + birthD + "\n on the hour number: " + birthH +
                "\n on the minute number: " + birthMS);

    }
}