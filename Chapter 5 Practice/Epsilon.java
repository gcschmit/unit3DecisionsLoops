/**
 * Write a program that reads floating-point number and prints "zero" is the number is zero. 
 * Otherwise, print "positive" or "negative." Add "small" if the absolute value of the number is 
 * less than 1.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Epsilon
{
    public static final double EPSILON = 1e-12;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double i = in.nextDouble();
        
        String adj = " ";
        if(Math.abs(i) < 1.0)
        {
            adj = "small ";
        }
        else if(Math.abs(i) > 1000000)
        {
            adj = "large ";
        }
        
        if(Math.abs(i-0) < EPSILON)
        {
            System.out.println("It's a zero.");
        }
        else if(i > 0)
        {
            System.out.println("It's a " + adj + "positive number." );
        }
        else
        {
            System.out.println("It's a " + adj + "negative number." );
        }
    }
}