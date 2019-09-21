import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lets you press start
 * 
 * @author Keagan Wilson, Subash Shibu, Alan Liang
 * @version 2.0
 */
public class Menu extends World
{
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new MouseCollider(), 400, 300);
    } 
}
