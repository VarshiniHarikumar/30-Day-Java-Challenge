package Day1;
public class Swapping2Num
{

  public static void main(String[]args)
  {

    int a= 30,  b= 70;

    System.out.println("Before swapping: "+ a + " " + b);
    /*  Using third variable
    int t=a;
    a=b;
    b=t;*/
    

    /* Using + and - without third variable
    a=a+b;
    b=a-b;
    a=a-b;*/

    
    /*Using * and / without third variable. This is only psossible when it has non zeroes numbers
    a=a*b;
    b=a/b;
    a=a/b;*/


    /*Using single statement
    b = a+b -(a=b);*/


    System.out.println("After swapping: "+ a+ " " + b);

  }
  
}
