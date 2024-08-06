package Day1;
import java.util.*;

public class simple_interest 
{
  public static void main(String[] args) 
  {
    Scanner s= new Scanner (System.in);

    System.out.print("Enter the Principal amount: ");
    double principal = s.nextDouble();

    System.out.print("Enter the Interest rate: ");
    double interest = s.nextDouble();

    System.out.print("Enter the time period(in years): ");
    double time = s.nextDouble();

    double si = (principal*interest*time)/100;

    System.err.println("The SIMPLE INTEREST IS: " + si);

    s.close();
         
  }
  
}
