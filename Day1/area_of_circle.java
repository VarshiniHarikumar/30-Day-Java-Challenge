package Day1;

import java.util.Scanner;

public class area_of_circle 
{
  public static void main(String[] args) 
  {
    Scanner r = new Scanner (System.in);
    
    System.out.print("Enter the radius: ");
    double radius = r.nextDouble();

    double a = 3.14*radius*radius;

    System.out.println("Area of circle is: " + a);
    r.close();


      
  }

  
}
