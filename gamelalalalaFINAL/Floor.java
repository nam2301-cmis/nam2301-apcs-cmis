import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floor extends actor 
{
    /**
     * Act - do whatever the Floor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        scoring();
        getScore();
    }    
    int Score=0;
    public int getScore()
    {
        return Score;
    }

    public void scoring()
    {
        if (isTouching(iceCream.class))
        {
           
             getWorld().removeObject(getOneIntersectingObject(iceCream.class));
        }
        else  if (isTouching(Garbage.class))
        {
             getWorld().removeObject(getOneIntersectingObject(Garbage.class));
        }
    }    
}
