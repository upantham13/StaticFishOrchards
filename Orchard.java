import java.util.ArrayList;
/**
 * Write a description of class Orchard here.
 *
 * @author Umasathvik Pantham
 * @version 05/04/2021
 */
public class Orchard
{
    private ArrayList<Tree> orchard;
    
    /**
     * Constructor for objects of class Orchard
     */
    public Orchard()
    {
        orchard = new ArrayList<Tree>();
    }

    /**
     * Adds a tree at a given position of the array list if the index is valid
     *
     *@param t the tree object being added
     *@param index the index of the ArrayList where the tree is being added
     */
    public void add(Tree t, int index)
    {
        if (index >= 0 && index <= orchard.size())
        {
            orchard.add(index, t);
        }
    }
    
    /**
     * Returns the first tallest tree
     * 
     * @return tallestTreeSoFar the tallest tree so far in the arrayList
     */
    public String tallest()
    {
        if (!orchard.isEmpty())
        {
            Tree tallestTreeSoFar = new Tree("", Integer.MIN_VALUE);
            for (Tree t: orchard)
            {
                if (t.getHeight() > tallestTreeSoFar.getHeight())
                {
                    tallestTreeSoFar = t;
                }
            }
            return tallestTreeSoFar.getTree();
        }
        return null;
    }
    
    /**
     *  Determines if the array list contains a Tree object of a given type
     *  
     *@param t the String given
     *@return contain the true or false of whether the Array list contains t
     */
    public boolean contains(String t)
    {
        boolean contain = false;
        if (orchard.toString().contains(t))
        {
            contain = true;
            return contain;
        }
        return contain;
    }
    
    /**
     * Returns an ArrayList<String> containing the types of all the Tree objects in the array list
     * 
     * @return orchard.toString() the string of the ArrayList
     */
    public String treeList()
    {
        return orchard.toString();
    }
}
