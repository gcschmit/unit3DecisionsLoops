

/**
 * Write a description of class StringCompare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        int result = word1.compareTo("aaa");
        
        if (result > 0)
        {
            System.out.println("word1 is lexicographically greater than aaa");
        }
        else if (result < 0)
        {
            System.out.println("word1 is lexicographically less than aaa");
        }
        else if (result == 0)
        {
            System.out.println("word1 is lexicographically equal to word2");
        }
        
        String word1prefix = word1.substring(0, 3);
        String word2prefix = word2.substring(0, 3);
        if (word1prefix.equals(word2prefix))
        {
            System.out.println("word1 and word2 have the same three-letter prefix");
        }
    }
}