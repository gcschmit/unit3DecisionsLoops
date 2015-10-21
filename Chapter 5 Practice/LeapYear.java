import java.util.Scanner;

public class LeapYear
{
   public void isLeapYear()
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input a year: ");
      int year = in.nextInt();
      int remainder = year%400;
      
      if ( remainder = 0 )
      {
          System.out.println(year+" is a leap year");
      }
   }
}