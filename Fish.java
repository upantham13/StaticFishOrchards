
/**
 * Finds the state of the fish and whether they're not hungry, somewhat hungry, hungry, or very hungry. 
 *
 * @author Umasathvik Pantham
 * @version 05/05/2021
 */
public class Fish
{
    public int state;
    public static final int NOT_HUNGRY = 1;
    public static final int SOMEWHAT_HUNGRY = 2;
    public static final int HUNGRY = 3;
    public static final int VERY_HUNGRY = 4;

    /**
     * Constructor for objects of class Fish
     */
    public Fish()
    {
        state = NOT_HUNGRY;
    }

    /**
     * 
     */
    public void swim()
    {
        if (state != VERY_HUNGRY)
        {
            if (state == NOT_HUNGRY)
            {
                state = SOMEWHAT_HUNGRY;
            }
            else if (state == SOMEWHAT_HUNGRY)
            {
                state = HUNGRY;
            }
            else if (state == HUNGRY)
            {
                state = VERY_HUNGRY;
            }
        }
    }
    
    /**
     * 
     */
    public void eat()
    {
        if (state != NOT_HUNGRY)
        {
            if (state == VERY_HUNGRY)
            {
                state = HUNGRY;
            }
            else if (state == HUNGRY)
            {
                state = SOMEWHAT_HUNGRY;
            }
            else if (state == SOMEWHAT_HUNGRY)
            {
                state = NOT_HUNGRY;
            }
        }
    }
    
    /**
     * 
     */
    public int getState()
    {
        return state;
    }
    
    /**
     * 
     */
    public String getHungerLevel() 
    {
        String s = "";
        if (state == NOT_HUNGRY)
        {
            s = "Not hungry";
        }
        else if (state == SOMEWHAT_HUNGRY)
        {
            s = "Somewhat hungry";
        }
        else if (state == HUNGRY)
        {
            s = "Hungry";
        }
        else
        {
            s = "Very hungry";
        }
        return s;
    }
}
