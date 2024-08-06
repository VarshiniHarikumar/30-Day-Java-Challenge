package Day1;
import java.util.Scanner;
public class largestofthreenos 
{
  public static void main(String[] args) 
  {
    Scanner sc= new Scanner (System.in);

    System.out.print("Enter A: ");
    double a = sc.nextDouble();

    System.out.print("Enter B: ");
    double b = sc.nextDouble();

    System.out.print("Enter C: ");
    double c = sc.nextDouble();

    if (a>b && a<c)
    {
      System.out.println("A IS LARGEST");
    }
    else if (b>c) 
    {
      System.out.println("B IS LARGEST");   
    }
    else 
    {
      System.out.println("C IS LARGEST");
    }
    sc.close(); 
    }
     
  }
  

