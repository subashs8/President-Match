import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.Collections.*;

/**
 * Represents the card
 * 
 * @author Keagan Wilson, Subash Shibu, Alan Liang
 * @version 2.0
 */
public class Carta extends Actor
{
    /**
     * id counts the id of the card
     */
    public int id;
    /**
     * shows the image of the card
     */
    public void flip()
    {
        String a = "carta" + Integer.toString(id);
        setImage("carta" + Integer.toString(id) + ".jpg");
    }
    /**
     * shows a backside
     */
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
    /**
     * Act - acts as the card. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        click();
    }    
}
