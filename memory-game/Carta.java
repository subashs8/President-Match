import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.Collections.*;

/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta extends Actor
{
    /**
     * Act - do whatever the Carta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int id;
    
    public void flip()
    {
        setImage("carta" + Integer.toString(id) + ".jpg");
    }
    
    public void unflip()
    {
        setImage("padrao.jpg");
    }
    
    private void click()
    {
        if(Greenfoot.mousePressed(this))
        {
            flip();
            Game.ids.add(this);
        }
    }
    
    public void act()
    {
        click();
    }    
}
