import java.util.Random;

public class DrunkardsWalk
{
    public static void printLocation()
    {
        int coordX = 0;
        int coordY = 0;
        System.out.println("Initial location: (0,0)");
        
        for( int i = 0;
                i < 100;
                i++)
        {
            Random rand = new Random();
            int direction = rand.nextInt(1) + 1;
            
        }
        
        System.out.println("(" + coordX + "," + coordY + ")");
    }
}
