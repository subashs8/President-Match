import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Collections;

/**
 * Basis of the game
 * Makes world
 * 
 * @author Keagan Wilson, Subash Shibu, Alan Liang
 * @version 2.0
 */
public class Game extends World
{
    /**
     * Variable Summer concepts:
     * 2D Arrays
     * ArrayLists
     */
    int[][] a = new int[2][1200]; //2D array (summer concept)
    private ArrayList<Carta> cards = new ArrayList<Carta>(); //ArrayList with cards (summer concept)
    public static ArrayList<Carta> ids = new ArrayList<Carta>(); //ArrayList with cards (summer concept)
    GreenfootSound acerto = new GreenfootSound("Vitoria.wav"); //victory sound
    GreenfootSound erro = new GreenfootSound("Derrota.wav"); //wrong sound
    Text timerText = new Text(); //instance of text
    private int timer = a[0].length; //timer set to 20 seconds
    /**
     * Constructor for objects of class Game
     * adds timer to the world
     * makes the cards using FOR LOOPS (summer concept)
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(timerText, 100, 300); //wherever
        timerText.setText("Time left: " + (timer/60));
         for(int i = 0; i < 12; i++)
        {
            cards.add(new Carta());
        }
               
        for(int i = 0; i < 6; i++)
        {
            cards.get(i).id = i;
            cards.get(i + 6).id = i+6;
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
    /**
     * Checks to see if card matches description. If it does the cards are removed, if not the
     * cards are turned over. Use of De Morgan's Law (summer concept)
     * Uses if-then statements (summer concept)
     */
    private void brain()
    {
        if(ids.size() > 1)
        {
            if(!((ids.get(0).id - ids.get(1).id != 6) && (ids.get(1).id - ids.get(0).id != 6))) 
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
                increasetimer(); //every time they get something correct, the timer increases by 5 secodns.
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
        if(numberOfObjects() <= 1)
        {
            Greenfoot.setWorld(new Gameover());
        }
    }  
    private void increasetimer()
    {
        timer = timer + 300; //increase timer by 5 seconds
    }
    /**
     * Act- displays timer
     * Calls brain method
     */
     public void act()
    {
        if (timer>0)
            timer--;
        if(timer == 0) Greenfoot.setWorld(new Fail());
        if (timer%60==0) timerText.setText("Time left: " + (timer/60));
        brain();
    }
}

    
       
