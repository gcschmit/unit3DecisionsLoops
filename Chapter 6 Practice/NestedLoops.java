// 
// public class NestedLoops
// {
//     public static void printNum()
//     {
//         int s = 0;
//         for (int i = 0; i < 4; i++)
//         {
//             s++;
//             System.out.println("1\t" +s);
//         }
//         int a = 0;
//         for (int i = 4; i >= 4 && i < 8; i++)
//         {
//             a++;
//             System.out.println("2\t" +a);
//         }
//     }
// }
// 
// public class NestedLoops
// {
//     public static void printNum()
//     {
//         int s=0;
//         int i=0;
//         while(i<4) 
//         {
//             i++;
//             s++ ;
//             System.out.println("1\t" +s); 
//         }
//         int a=0;
//         while(i>=4 && i<8)
//         {
//             i++;
//             a++; 
//             System.out.println("2\t" +a); 
//         }    
//     }
// }
) 
    
{    
public class NestedLoops
{
    public static void printNum()
    {
        int s=0;
        int i=0;
        do {
            i++;
            s++ ;
            System.out.println("1\t" +s); 
        } while (i<4);
        int a =0;
        do{ 
            i++;
            a++; 
            System.out.println("2\t"+ a); 
            
        } while (i>=4 && i<8);    
            
    }
}