import java.util.Scanner;
public class FavNumbers {
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  int favN1 = 0;
  double favD1 = 0;

  favN1 = SafeInput.getInt(scan, "Please enter your favorite integer");

  favD1 = SafeInput.getDouble(scan, "Please enter your favorite double");
  System.out.println("\n favorite integer: " + favN1);
  System.out.println("favorite double: " + favD1);
 }
}