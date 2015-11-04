import java.util.Scanner;

public class NumericalMethods
{
    public static void printFibNum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer greater than zero: ");
        int userNum = scan.nextInt();
        
        int fold1 = 1;
        int fold2 = 1;
        int fnew = fold1 + fold2;
        for (int i = 0;
                i < userNum-3;
                i++)
        {
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1 + fold2;
        }
        
        if (userNum > 2)
        {
            System.out.println("The Fibonacci number is: "+ fnew  );
        }
        else
        {
            System.out.println("The Fibonacci number is: 1");
        }
    }
}
