import java.util.Scanner;

public class LeapYear
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input a year: ");
      int year = in.nextInt();
      int remainder = year%400;
      
      if ( remainder == 0 )
      {
          System.out.println(year+" is a leap year");
      }
      else
      {
          System.out.println(year+" is not a leap year");
      }
   }
}