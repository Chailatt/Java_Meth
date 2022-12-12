import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        boolean h = true;
        double totalprice = 0.0;


        while(h)
        {
            double nextPrice = SafeInput.getRangedDouble(scan, " Please enter item price: ",
                    0.50, 9.99);
            totalprice +=  nextPrice;
            h = SafeInput.getYNConfirm(scan, "Do you wish to add another item?");
        }

        System.out.println(String.format("Your total price is " + "%.2f", totalprice));
    }
}