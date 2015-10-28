
public class NestedLoops
{
    public static void printNum()
    {
        int s = 0;
        for (int i = 0; i < 4; i++)
        {
            s++;
            System.out.println("1\t" +s);
        }
        int a = 0;
        for (int i = 4; i >= 4 && i < 8; i++)
        {
            a++;
            System.out.println("2\t" +a);
        }
    }
}
