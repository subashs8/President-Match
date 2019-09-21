import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MouseCollider3 here.
 * 
 * @author Keagan Wilson, Subash Shibu, Alan Liang
 * @version 2.0
 */
public class MouseCollider3 extends Actor
{
    /**
     * Act - do whatever the MouseCollider2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
       {
           Greenfoot.setWorld(new Menu());
       }
    }    
}
