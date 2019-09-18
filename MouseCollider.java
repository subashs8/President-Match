import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MouseCollider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MouseCollider extends Actor
{
    /**
     * Act - do whatever the MouseCollider wants to do. This method is called whenever
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
