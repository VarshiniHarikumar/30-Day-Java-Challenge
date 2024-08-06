package Day1;
import java.util.Scanner;
public class math_power 
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner (System.in);

    System.out.print("Enter a base number: ");
    double base = sc.nextDouble();

    System.out.print("Enter the power: ");
    double power = sc.nextDouble();

    double result = Math.pow(base, power);

    System.out.print(base + " raised to the power of " + power + " is " + result);

    sc.close();




  }
  
}
