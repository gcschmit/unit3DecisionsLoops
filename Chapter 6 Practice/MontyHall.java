import java.util.Random;

public class MontyHall
{
    public static void Simulator()
    {
        int strat1 = 0;
        int strat2 = 0;
        for (int i = 0;
                i<1000;
                i++)
        {
            //door with the car
            Random rand = new Random();
            int car_door = rand.nextInt(3)+1;
            
            //door randomly picked by player
            Random user = new Random();
            int user_num = user.nextInt(3)+1;
            
            //door with the goat        
            Random host = new Random();
            int goat_door = host.nextInt(3)+1;
            
            while (goat_door == user_num)
            {
                int newgoat_door = host.nextInt(3)+1;
                goat_door = newgoat_door;
            }
            
            if (user_num==car_door)
            {
                strat2++;
            }
            else if (goat_door==car_door)
            {
                strat1++;
            } 
        }
        
        System.out.println("Strategy 1: "+strat1);
        System.out.println("Strategy 2: "+strat2);
    }
}
