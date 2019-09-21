import greenfoot.*;
 /**
 * Used as a timer
 * 
 * @author Keagan Wilson, Subash Shibu, Alan Liang 
 * @version 2.0
 */
public class Text extends Actor
{
    public Text()
    {
        this("");
    }
 
    public Text(String text)
    {
        setText(text);
    }
 
    public void setText(String text)
    {
        setImage(new GreenfootImage(text, 24, Color.WHITE, new Color(0, 0, 0, 0)));
    } 
}