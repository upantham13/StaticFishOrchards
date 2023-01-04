import java.util.ArrayList;
import java.util.Arrays;
/**
 * Utility class that works with several static methods to
 * work with arrays and array lists.
 * 
 * @author  Umasathvik Pantham   
 * @version 05/03/2021
 */
public class StaticPractice
{
    /**
     * Gets the average value of all positive elements in the array.
     * The array has size values, and, if the array has no positive elements, 
     * returns 0. 
     */
    public static double averageOfPositive (int[] numbers, int size)
    {
        if (size > 0)
        {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < size; i ++)
            {
                if (numbers[i] > 0)
                {
                    sum += numbers[i];
                    count ++;
                }
            }
            return (double)sum / count;
        }
        return 0;
    }
    
    
    /**
     * Gets the average value of all positive elements in the array list.
     * If the array list has no positive elements, returns 0. You should
     * use the enhanced for loop.
     */
    public static double averageOfPositive (ArrayList<Integer> numbers)
    {
        if (numbers.size() > 0)
        {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < numbers.size(); i ++)
            {
                if (numbers.get(i) > 0)
                {
                    sum += numbers.get(i);
                    count ++;
                }
            }
            return (double)sum / count;
        }
        return 0;
    }
    
    
    /**
     * Gets the count of occurrences of target in the array.
     * The array has size values.
     */
    public static int count(String[] list, int size, String target) 
    {
        int count = 0;
        for (int i = 0; i < size; i ++)
        {
            if (list[i].equals(target))
            {
                count ++;
            }
        }
        return count;
    }
    
    /**
     * Gets the count of occurrences of target in the array list.
     * You should use the enhanced for loop.
     */
    public static int count(ArrayList<String> list, String target) 
    {
        int count = 0;
        for (int i = 0; i < list.size(); i ++)
        {
            if (list.get(i).equals(target))
            {
                count ++;
            }
        }
        return count;
    }
}