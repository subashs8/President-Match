import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game over when you fail
 * 
 * @author Keagan Wilson, Subash Shibu, Alan Liang
 * @version 2.0
 */
public class Fail extends World
{
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Fail()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new MouseCollider3(), 400, 300);
    } 
}
