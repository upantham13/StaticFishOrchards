
/**
 * Models tree objects that are in the orchard.
 *
 * @author Umasathvik Pantham
 * @version 05/04/2021
 */
public class Tree
{
    private String tree;
    private double height;

    /**
     * Constructor for objects of class Tree
     * 
     *@param theType type of the tree
     *@param theHeight height of the tree
     */
    public Tree(String theType, double theHeight)
    {
        tree = theType;
        height = theHeight;
    }

    /**
     *Gets the name of the tree
     *
     *@return tree the name of the tree in the arraylist
     */
    public String getTree()
    {
        String s = "Tree[Type:" + tree + ",Height:" + height + "]";
        return s;
    }
    
    /**
     * Gets the height of the tree
     * 
     *@return height the height of the tree in the arraylist
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     *Gets a string with the name and height of the trees.
     *
     *@return the string of the ArrayList
     */
    @Override
    public String toString()
    {
        String s = "" + tree + "";
        return s;
    }
}
