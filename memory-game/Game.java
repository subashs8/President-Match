import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game
     * 
     */
    private ArrayList<Carta> cards = new ArrayList<Carta>();
    public static ArrayList<Carta> ids = new ArrayList<Carta>();
    GreenfootSound acerto = new GreenfootSound("Vitoria.wav");
    GreenfootSound erro = new GreenfootSound("Derrota.wav");
    
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
         for(int i = 0; i < 12; i++)
        {
            cards.add(new Carta());
        }
               
        for(int i = 0; i < 6; i++)
        {
            cards.get(i).id = i;
            cards.get(i + 6).id = i;
        }
        
        for(int i = 0; i < 2; i++)
        {
            Collections.shuffle(cards);
            for(int j = 0; j < 6; j++)
            {
                addObject(cards.get(j), 100 * j + 150, 50 + 150 * i);
                addObject(cards.get(j + 6), 100 * j + 150, 200 + 150 * i);
            }
        }
    }
    
    private void brain()
    {
        if(ids.size() > 1)
        {
            if(ids.get(0).id == ids.get(1).id)
            {
                acerto.play();
                Greenfoot.delay(20);
                ids.get(0).getImage().setTransparency(80);
                ids.get(0).getImage().setTransparency(50);
                
                ids.get(1).getImage().setTransparency(80);
                ids.get(1).getImage().setTransparency(50);
                Greenfoot.delay(20);
                
                removeObject(ids.get(0));
                removeObject(ids.get(1));
                ids.remove(1);
                ids.remove(0);
            }
            else
            {
                erro.play();
                Greenfoot.delay(20);
                ids.get(0).getImage().setTransparency(80);
                ids.get(0).getImage().setTransparency(50);
                
                ids.get(1).getImage().setTransparency(80);
                ids.get(1).getImage().setTransparency(50);
                Greenfoot.delay(20);
                ids.get(0).unflip();
                ids.get(1).unflip();
                ids.remove(1);
                ids.remove(0);
            }
        }
        if(numberOfObjects() < 1)
        {
            Greenfoot.setWorld(new Gameover());
        }
    }  

     public void act()
    {
        brain();
    }
}

    
       
