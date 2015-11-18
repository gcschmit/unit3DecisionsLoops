import java.util.Scanner; 

public class Diamonds
{
    public static void printDiamond()   
    {
        Scanner scan= new Scanner(System.in); 
        System.out.print("Enter a number for the side length: "); 
        int side_length = scan.nextInt();
        
        int max_width = side_length * 2 - 1;
        int half_width = max_width / 2;
        int ast_num = 1;
        
        // top half
        for (int i = 0; i < side_length; i++) 
        {
            for (int j = 0; j < half_width; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < ast_num; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
            ast_num += 2;
            half_width -= 1;
        }
        
        // bottom half
        ast_num = max_width - 2;
        half_width = 1;
        for (int i = 0; i < side_length; i++)
        {
            for (int j = 0; j < half_width; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < ast_num; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
            ast_num -= 2;
            half_width += 1;
        }
            
    }   
}  