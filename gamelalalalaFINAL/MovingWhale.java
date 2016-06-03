import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingWhale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingWhale extends Slowing 
{
    /**
     * Act - do whatever the MovingWhale wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getScore();
        setLocation(getX(),getY()+1);
        for(int i=0;i<100;i++)
        {
            if (isAtEdge())
           {
            setLocation(getX(),0);
           }
        }
    }    
    
    int Score=0;
    public int getScore()
    {
        return Score;
    }
}
