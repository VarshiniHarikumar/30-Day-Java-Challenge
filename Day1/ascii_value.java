package Day1;
import java.util.*;
public class ascii_value 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter a character: ");
    char ch = sc.next().charAt(0);

    int asciiValue = (int) ch;

    System.out.println("The ASCII value of " + ch + " is: " + asciiValue);

    sc.close();


      
  }
  
}