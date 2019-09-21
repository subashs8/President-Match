import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start background
 * 
 * @author Keagan Wilson, Subash Shibu, Alan Liang
 * @version 2.0
 */
public class MouseCollider extends Actor
{
    /**
     * Act - sets the world to the game. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. 
     */
    public void act() 
    {
       if(Greenfoot.mousePressed(this))
       {
           Greenfoot.setWorld(new Game());
       }
    }       
}
